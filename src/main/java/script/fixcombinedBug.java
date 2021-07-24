package script;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

import config.Constant;
import entity.PatchJson;
import lombok.extern.slf4j.Slf4j;
import util.FileIO;

@Slf4j
public class fixcombinedBug {
    public static String combinedMethod = "/**\n"
            + "     * Draws the plot on a Java 2D graphics device (such as the screen or a\n"
            + "     * printer).\n"
            + "     * <P>\n"
            + "     * At your option, you may supply an instance of {@link PlotRenderingInfo}.\n"
            + "     * If you do, it will be populated with information about the drawing,\n"
            + "     * including various plot dimensions and tooltip info.\n"
            + "     *\n"
            + "     * @param g2  the graphics device.\n"
            + "     * @param area  the area within which the plot (including axes) should\n"
            + "     *              be drawn.\n"
            + "     * @param anchor  the anchor point (<code>null</code> permitted).\n"
            + "     * @param parentState  the state from the parent plot, if there is one.\n"
            + "     * @param state  collects info as the chart is drawn (possibly\n"
            + "     *               <code>null</code>).\n"
            + "     */\n"
            + "    public void draw(Graphics2D g2, Rectangle2D area,\n"
            + "                     Point2D anchor,\n"
            + "                     PlotState parentState,\n"
            + "                     PlotRenderingInfo state) {\n"
            + "\n"
            + "        // if the plot area is too small, just return...\n"
            + "        boolean b1 = (area.getWidth() <= MINIMUM_WIDTH_TO_DRAW);\n"
            + "        boolean b2 = (area.getHeight() <= MINIMUM_HEIGHT_TO_DRAW);\n"
            + "-        if (b1 || b2) {\n"
            + "+        if (!b1 || b2) {\n"
            + "            return;\n"
            + "        }\n"
            + "\n"
            + "        // record the plot area...\n"
            + "        if (state == null) {\n"
            + "            // if the incoming state is null, no information will be passed\n"
            + "            // back to the caller - but we create a temporary state to record\n"
            + "            // the plot area, since that is used later by the axes\n"
            + "            state = new PlotRenderingInfo(null);\n"
            + "        }\n"
            + "        state.setPlotArea(area);\n"
            + "\n"
            + "        // adjust the drawing area for the plot insets (if any)...\n"
            + "        RectangleInsets insets = getInsets();\n"
            + "        insets.trim(area);\n"
            + "\n"
            + "        // calculate the data area...\n"
            + "        AxisSpace space = calculateAxisSpace(g2, area);\n"
            + "        Rectangle2D dataArea = space.shrink(area, null);\n"
            + "        this.axisOffset.trim(dataArea);\n"
            + "\n"
            + "        state.setDataArea(dataArea);\n"
            + "\n"
            + "        // if there is a renderer, it draws the background, otherwise use the\n"
            + "        // default background...\n"
            + "        if (getRenderer() != null) {\n"
            + "            getRenderer().drawBackground(g2, this, dataArea);\n"
            + "        }\n"
            + "        else {\n"
            + "            drawBackground(g2, dataArea);\n"
            + "        }\n"
            + "\n"
            + "        Map axisStateMap = drawAxes(g2, area, dataArea, state);\n"
            + "\n"
            + "        // don't let anyone draw outside the data area\n"
            + "        Shape savedClip = g2.getClip();\n"
            + "        g2.clip(dataArea);\n"
            + "\n"
            + "        drawDomainGridlines(g2, dataArea);\n"
            + "\n"
            + "        AxisState rangeAxisState = (AxisState) axisStateMap.get(getRangeAxis());\n"
            + "        if (rangeAxisState == null) {\n"
            + "            if (parentState != null) {\n"
            + "                rangeAxisState = (AxisState) parentState.getSharedAxisStates()\n"
            + "                        .get(getRangeAxis());\n"
            + "            }\n"
            + "        }\n"
            + "        if (rangeAxisState != null) {\n"
            + "            drawRangeGridlines(g2, dataArea, rangeAxisState.getTicks());\n"
            + "        }\n"
            + "\n"
            + "        // draw the markers...\n"
            + "        for (int i = 0; i < this.renderers.size(); i++) {\n"
            + "            drawDomainMarkers(g2, dataArea, i, Layer.BACKGROUND);\n"
            + "        }\n"
            + "        for (int i = 0; i < this.renderers.size(); i++) {\n"
            + "            drawRangeMarkers(g2, dataArea, i, Layer.BACKGROUND);\n"
            + "        }\n"
            + "\n"
            + "        // now render data items...\n"
            + "        boolean foundData = false;\n"
            + "\n"
            + "        // set up the alpha-transparency...\n"
            + "        Composite originalComposite = g2.getComposite();\n"
            + "        g2.setComposite(AlphaComposite.getInstance(\n"
            + "                AlphaComposite.SRC_OVER, getForegroundAlpha()));\n"
            + "\n"
            + "        DatasetRenderingOrder order = getDatasetRenderingOrder();\n"
            + "        if (order == DatasetRenderingOrder.FORWARD) {\n"
            + "            for (int i = 0; i < this.datasets.size(); i++) {\n"
            + "                foundData = render(g2, dataArea, i, state) || foundData;\n"
            + "            }\n"
            + "        }\n"
            + "        else {  // DatasetRenderingOrder.REVERSE\n"
            + "            for (int i = this.datasets.size() - 1; i >= 0; i--) {\n"
            + "                foundData = render(g2, dataArea, i, state) || foundData;\n"
            + "            }\n"
            + "        }\n"
            + "        // draw the foreground markers...\n"
            + "        for (int i = 0; i < this.renderers.size(); i++) {\n"
            + "            drawDomainMarkers(g2, dataArea, i, Layer.FOREGROUND);\n"
            + "        }\n"
            + "        for (int i = 0; i < this.renderers.size(); i++) {\n"
            + "            drawRangeMarkers(g2, dataArea, i, Layer.FOREGROUND);\n"
            + "        }\n"
            + "\n"
            + "        // draw the annotations (if any)...\n"
            + "        drawAnnotations(g2, dataArea);\n"
            + "\n"
            + "        g2.setClip(savedClip);\n"
            + "        g2.setComposite(originalComposite);\n"
            + "\n"
            + "        if (!foundData) {\n"
            + "            drawNoDataMessage(g2, dataArea);\n"
            + "        }\n"
            + "\n"
            + "        // draw range crosshair if required...\n"
            + "        if (isRangeCrosshairVisible()) {\n"
            + "            // FIXME: this doesn't handle multiple range axes\n"
            + "            drawRangeCrosshair(g2, dataArea, getOrientation(),\n"
            + "                    getRangeCrosshairValue(), getRangeAxis(),\n"
            + "                    getRangeCrosshairStroke(), getRangeCrosshairPaint());\n"
            + "        }\n"
            + "\n"
            + "        // draw an outline around the plot area...\n"
            + "        if (getRenderer() != null) {\n"
            + "            getRenderer().drawOutline(g2, this, dataArea);\n"
            + "        }\n"
            + "        else {\n"
            + "            drawOutline(g2, dataArea);\n"
            + "        }\n"
            + "\n"
            + "    }";

    public static void main(String[] args) {
        String trainSet_unpurify_list = Constant.HOME + "/result/combineInfo/trainSet_unpurify_list";
        String target = Constant.HOME + "/result/combineInfo/trainSet_unpurify_list_tmp";
        try {
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(trainSet_unpurify_list);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                if (StringUtils.isNotBlank(str)) {
                    PatchJson patchJson = JSON.parseObject(str, PatchJson.class);
                    log.info("Process " + patchJson.getPatchName());
                    if (patchJson.getPatchName().equals("patch1-Chart-26-jMutRepair-plausible.patch")) {
                        patchJson.setCombinedMethod(combinedMethod);
                    }
                    FileIO.writeStringToFile(target, JSON.toJSONString(patchJson) + "\n", true);
                }
            }
            //close
            inputStream.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
