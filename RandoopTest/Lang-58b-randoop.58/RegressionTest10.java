import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test001");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.clean("#######################################################################################          ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#######################################################################################" + "'", str1.equals("#######################################################################################"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test002");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray6);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray12, byteArray15);
        byte byte17 = org.apache.commons.lang.math.NumberUtils.min(byteArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray6, byteArray15);
        byte[] byteArray19 = null;
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray19);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.min(byteArray15);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.max(byteArray15);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray15);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test003");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                               hi!                                              ", "4444444hi!aaaaaaaa..!ih..", "AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                               aAA                                              " + "'", str3.equals("                                               aAA                                              "));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test004");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaa", "###                     aaaaaaaaa                  A         A         A         A         A         A         A         A         A         A                      ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test005");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("...                          ...", "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test006");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("                                                ", "44444444444444444444444         AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test007");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test008");
        float[] floatArray1 = new float[] { (byte) 1 };
        float float2 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray6 = new float[] { (byte) -1, (-1.0f), (byte) 100 };
        float float7 = org.apache.commons.lang.math.NumberUtils.max(floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray6);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray6);
        float float10 = org.apache.commons.lang.math.NumberUtils.max(floatArray6);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test009");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                     4444444Hi!                     ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2.equals("  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test010");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("a a a a a a", "          #############################################################################", "Aaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a a a a a a" + "'", str3.equals("a a a a a a"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test011");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("4ahi!", '4', 'a');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aahi!" + "'", str3.equals("aahi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test012");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaAiaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA", (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test013");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("                                                                                     ", "###                     aaaaaaaaai!   ", "aaaaaaaaAaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test014");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("i", "                                                ...                          ......                 ", "                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                ", 2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "i" + "'", str4.equals("i"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test015");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.clean("AAAAAAAAA ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AAAAAAAAA" + "'", str1.equals("AAAAAAAAA"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test016");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("                                              !ih                                               ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "#########");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                              !ih                                               " + "'", str3.equals("                                              !ih                                               "));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test017");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("##a##a#!ih", "                                               aAA                                              ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test018");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteSpaces("4444444hi!aaaaaaaaa                                                                                        ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4444444hi!aaaaaaaaa" + "'", str1.equals("4444444hi!aaaaaaaaa"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test019");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("i!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "i!" + "'", str1.equals("i!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test020");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.prechomp("4444444hi!aaaaaaaa..!ih..", "Aaaaaaaaa4");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4444444hi!aaaaaaaa..!ih.." + "'", str2.equals("4444444hi!aaaaaaaa..!ih.."));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test021");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("   aaaaaaaaa                                        ", "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test022");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ", "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa                                                                  ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test023");
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat(" aaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test024");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray9 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray2, intArray9);
        int[] intArray14 = new int[] { '4', 0, (byte) 0 };
        int[] intArray17 = new int[] { 100, 1 };
        int[] intArray24 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray24);
        int[] intArray32 = new int[] { '4', (short) 100, (short) 100, 52, (byte) 1, (short) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray32);
        int int34 = org.apache.commons.lang.math.NumberUtils.max(intArray32);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray14, intArray32);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray32);
        int[] intArray37 = null;
        int[] intArray41 = new int[] { '4', 0, (byte) 0 };
        int[] intArray44 = new int[] { 100, 1 };
        int[] intArray51 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray51);
        int[] intArray59 = new int[] { '4', (short) 100, (short) 100, 52, (byte) 1, (short) 100 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray51, intArray59);
        int int61 = org.apache.commons.lang.math.NumberUtils.max(intArray59);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray59);
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray37, intArray59);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray59);
        int int66 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test025");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("", "        aaaaaaaaaaaaaaaaaaaa        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test026");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test027");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("", "                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test028");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaa                                                                           ...", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaa                                                                           ..." + "'", str2.equals("aaaaaaaaa                                                                           ..."));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test029");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("###                     Aaaaaaaaa                                                                                        ", 12, "          ");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "###                     Aaaaaaaaa                                                                                        " + "'", str3.equals("###                     Aaaaaaaaa                                                                                        "));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test030");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("a                                                hi!                                                 ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a                                                hi!                                                 " + "'", str1.equals("a                                                hi!                                                 "));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test031");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test032");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("", "a                                                hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test033");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test034");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("... !ih...aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "... !ih...aaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("... !ih...aaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test035");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 90, (long) (short) 0, (long) 94);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 94L + "'", long3 == 94L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test036");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("4444444hI!AAAAAAAAA                                                                                        ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test037");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("                                                                                     ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test038");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("                                                                 ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test039");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test040");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test041");
        try {
            java.lang.Double double1 = org.apache.commons.lang.math.NumberUtils.createDouble("4444444444444          444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444          444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test042");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                                                                           ", (int) (short) 10, 20);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "...              ..." + "'", str3.equals("...              ..."));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test043");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimitedString("                                                                                        ", "!i aaaaaaaaa                                          ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test044");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test045");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("          aaaaaaaaa ", "##########################################!i aaaaaaaaa###########################################", "   #######################################################################################");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "####################" + "'", str3.equals("####################"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test046");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("HI!                                   a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test047");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("aaa ", "                         I!                         ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa" + "'", str2.equals("aaa"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test048");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalise("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "IaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA" + "'", str1.equals("IaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test049");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaa   A aaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test050");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa i!", "             A               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test051");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitaliseAllWords("HHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HHHHHHHHHH" + "'", str1.equals("HHHHHHHHHH"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test052");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaaa", "aa aaaaaaaaa aaaaaaaaa aaaa", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test053");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test054");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlayString("                                                hi!                                                 ", "Hi!   #######################################################################################             ######       A", 37, 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                     Hi!   #######################################################################################             ######       A                                      hi!                                                 " + "'", str4.equals("                                     Hi!   #######################################################################################             ######       A                                      hi!                                                 "));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test055");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test056");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" 4            ", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "444444444444444444444444444444444444444444444          44444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4" + "'", str5.equals("4"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test057");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("aaaaaaaaAaa", "Hi!                                   A");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaAaa" + "'", str2.equals("aaaaaaaaAaa"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test058");
        java.util.Collection collection0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(collection0, "                                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test059");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray16);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray13);
        try {
            byte byte22 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test060");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 7L, (long) 891);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 891L + "'", long3 == 891L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test061");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("AAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test062");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test063");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(objArray0, ' ');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test064");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("...aaaa", 48, '#');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#########################################...aaaa" + "'", str3.equals("#########################################...aaaa"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test065");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!Aa hi!AAAAAAAAAA ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test066");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chompLast("                                                                                                            ", "aaaaaaaaa                          ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                                            " + "'", str2.equals("                                                                                                            "));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test067");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("           !ih            ", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test068");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aaaaaaaaa ", "A                                                hi!", (int) (byte) -1);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test069");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank("                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test070");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!" + "'", str1.equals("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test071");
        java.util.Iterator iterator0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(iterator0, "aAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAI!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test072");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test073");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test074");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(19, 32, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test075");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("                                                                                                    ", "4444444hI AAAAAAAAA                                                                                        ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                                    " + "'", str2.equals("                                                                                                    "));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test076");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("########################", "                                                            AAAAAAAAA                                       ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test077");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray16);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray16);
        byte[] byteArray20 = null;
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray24, byteArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray27);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray36);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray27);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) -1 + "'", byte43 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) -1 + "'", byte46 == (byte) -1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test078");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 14, 63L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 63L + "'", long3 == 63L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test079");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                " + "'", str1.equals("                                "));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test080");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("aaaaaa", "aaaaaaaaa i!            ", "AAAAAAAAAAAAAAAAAAAA", 87);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "aaaaaa" + "'", str4.equals("aaaaaa"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test081");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.prechomp("##Aaaaaaaaa", "          ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##Aaaaaaaaa" + "'", str2.equals("##Aaaaaaaaa"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test082");
        float[] floatArray6 = new float[] { (-1.0f), 0, 96, 94, (byte) -1, (-1) };
        float[] floatArray11 = new float[] { 10, (byte) 1, 1L, (byte) -1 };
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray6, floatArray11);
        float[] floatArray17 = new float[] { (byte) -1, (-1.0f), (byte) 100 };
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        float[] floatArray20 = new float[] { (byte) 1 };
        float float21 = org.apache.commons.lang.math.NumberUtils.max(floatArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray20);
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray20);
        float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray20);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test083");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaaaaaaaaaaaa                                ", 27, 93);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                         " + "'", str3.equals("                         "));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test084");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 26, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test085");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray7);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray4);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test086");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("##########################################                         i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test087");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test088");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("", "Aaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test089");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test090");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("", 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test091");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test092");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!   #######################################################################################       A");
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "A         A         A         A         A         A         A         A         A         A", 2, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test093");
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.chompLast("               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                         HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -119");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test094");
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.chompLast("A!ih", "!###################################A");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test095");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(34L, 0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test096");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("!iH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test097");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("... !IH...                      aAAAAAAAAaAAAAAAAAaAAAAAAAAaA... !IH...                       ", "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test098");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("A...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test099");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAA", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test100");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("...aaaaaaa");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "...aaaaaaa" + "'", str1.equals("...aaaaaaa"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test101");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray9 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray2, intArray9);
        int[] intArray13 = new int[] { 100, 1 };
        int[] intArray20 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray20);
        int[] intArray25 = new int[] { '4', 0, (byte) 0 };
        int[] intArray28 = new int[] { 100, 1 };
        int[] intArray35 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray35);
        int[] intArray43 = new int[] { '4', (short) 100, (short) 100, 52, (byte) 1, (short) 100 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray43);
        int int45 = org.apache.commons.lang.math.NumberUtils.max(intArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray43);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray43);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray2, intArray43);
        int int49 = org.apache.commons.lang.math.NumberUtils.max(intArray2);
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test102");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join(objArray0, ' ', 94, 94);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test103");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Aaaaaaaaa4", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test104");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaai!", "... !ih...                      AaaaaaaaaAaaaaaaaaAaaaaaaaaAa... !ih...                       ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test105");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("hi", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test106");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("4444444hI!AAAAAAAAA", "##A##A#!ih", " AAAAAAAAA");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4444444hI!AAAAAAAAA" + "'", str3.equals("4444444hI!AAAAAAAAA"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test107");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalise("                                          aaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                          aaaaaaaaa " + "'", str1.equals("                                          aaaaaaaaa "));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test108");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("4444444444444444444444444444444444...", "                                            !I AAAAAAAAA                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test109");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test110");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlayString("...                                    !i aaaaaaaaa                                            ", "                                            aaaaaaaaa i!                                            ", 93, 12);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "...                                    !i aaaaaaaaa                                                                                      aaaaaaaaa i!                                                                       !i aaaaaaaaa                                            " + "'", str4.equals("...                                    !i aaaaaaaaa                                                                                      aaaaaaaaa i!                                                                       !i aaaaaaaaa                                            "));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test111");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("...                                    !i aaaaaaaaa                                                                                      aaaaaaaaa i!                                                                       !i aaaaaaaaa                                            ", "                                              !ih                                               ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "...                                    !i aaaaaaaaa                                                                                      aaaaaaaaa i!                                                                       !i aaaaaaaaa                                            " + "'", str2.equals("...                                    !i aaaaaaaaa                                                                                      aaaaaaaaa i!                                                                       !i aaaaaaaaa                                            "));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test112");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("44444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test113");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(29.0f, (float) 7L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test114");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ", "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa " + "'", str2.equals("  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test115");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(4.4444444444444446E67d, (double) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444444444444446E67d + "'", double3 == 4.4444444444444446E67d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test116");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("   A ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test117");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray6 = new double[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray6);
        double[] doubleArray13 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray14 = new double[] {};
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray14);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray21 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray22 = new double[] {};
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray22);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray16);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray16);
        double[] doubleArray31 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray32 = new double[] {};
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray32);
        double[] doubleArray34 = null;
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test118");
        java.util.Collection collection0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(collection0, "#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test119");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 82, "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3.equals("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test120");
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test121");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("a a a a a a a a a a a", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test122");
        char[] charArray8 = new char[] { ' ', ' ' };
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ", charArray8);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("hi!                                   A", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaa ", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("##########################################!i aaaaaaaaa###########################################", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("                                                                                                                  HI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test123");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaa                          ", '#', 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test124");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getChomp("Aaaaaaaaa                          ", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test125");
        int[] intArray4 = new int[] { 100, 1 };
        int[] intArray11 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "                                                                                                 ");
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 10, "aaaaaaaaa                                                                                        ", boolean12, "aaaaaaaaa ", strArray16 };
        java.lang.String str19 = org.apache.commons.lang.StringUtils.join(objArray17, "hi!");
        java.lang.String str20 = org.apache.commons.lang.StringUtils.join(objArray17);
        java.lang.String str21 = org.apache.commons.lang.StringUtils.join(objArray17);
        java.lang.String str22 = org.apache.commons.lang.StringUtils.concatenate(objArray17);
        java.lang.String str24 = org.apache.commons.lang.StringUtils.join(objArray17, '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test126");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ", 32);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa " + "'", str2.equals("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa "));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test127");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 48L, (double) 99.0f, (double) 51.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test128");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getNestedString("", "###                     Aaaaaaaaa                                                                                        ", "                                                HI!                                                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test129");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("          ", "!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test130");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.clean("###                     Aaaaaaaaa                                                                                        ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "###                     Aaaaaaaaa" + "'", str1.equals("###                     Aaaaaaaaa"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test131");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test132");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test133");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 31L, (float) 13, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test134");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("A                                                hi!", "###                     aaaaaaaaa                                                                                        ", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test135");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaa                                ", "        aaaaaaaaaaaaaaaaaaaa        ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test136");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { '#' };
        long[] longArray6 = new long[] { 97, (-1), ' ' };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray11 = new long[] { '#' };
        long[] longArray15 = new long[] { 97, (-1), ' ' };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray11);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray22 = null;
        long[] longArray24 = new long[] { '#' };
        long[] longArray28 = new long[] { 97, (-1), ' ' };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray28);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray24);
        long[] longArray33 = new long[] { '#' };
        long[] longArray37 = new long[] { 97, (-1), ' ' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray37);
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray33);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray33);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray33);
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35L + "'", long39 == 35L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 35L + "'", long40 == 35L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 35L + "'", long41 == 35L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 35L + "'", long44 == 35L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test137");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chopNewline("444444444444444444444444444                                              hi!          ...");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "444444444444444444444444444                                              hi!          ..." + "'", str1.equals("444444444444444444444444444                                              hi!          ..."));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test138");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test139");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("           HI!            ", "                        AAAAAAAAAAAAAAAAAAAA                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test140");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("... !ih...", 82, 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test141");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 7, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test142");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalise("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test143");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                                                 !ih                                                ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test144");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("...", "A         A         A         A         A         A         A         A         A         A       i!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test145");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chopNewline("                             hi!                                   A                             ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                             hi!                                   A                             " + "'", str1.equals("                             hi!                                   A                             "));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test146");
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test147");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("44444444444444444444444444444                                                HI!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "44444444444444444444444444444                                                HI" + "'", str1.equals("44444444444444444444444444444                                                HI"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test148");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A                ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A                " + "'", str1.equals("                aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A                "));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test149");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test150");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                         HI!", "Aa ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test151");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaAaaaaaaaa", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test152");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.prechomp(" AAAAAAAAA", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " AAAAAAAAA" + "'", str2.equals(" AAAAAAAAA"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test153");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai", "                                                hi!                                                 ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test154");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("                         I!                         ", 54);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                          I!                          " + "'", str2.equals("                          I!                          "));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test155");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("                        aaaaaaaaaaaaaaaaaaaa                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test156");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test157");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), (double) 52.0f, (double) 155L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test158");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                         i!                         ", 52);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                         i!                         " + "'", str2.equals("                         i!                         "));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test159");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty("iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test160");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("   A ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "   A " + "'", str1.equals("   A "));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test161");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("             a               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test162");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("!ih aA", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test163");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test164");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("A...", (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test165");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("               ...                          ...", 27);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ..." + "'", str2.equals("               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ..."));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test166");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble(" AAAAAAa a a a a a a a a a a a a a a a a  a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ", (double) 51);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.0d + "'", double2 == 51.0d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test167");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("                                                                                                   ", "                aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A                ", "", 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                                                                   " + "'", str4.equals("                                                                                                   "));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test168");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("###                                                                                       aaaaaaaaa ", (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test169");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#############################################################################          ", 'a');
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("aaAaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test170");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("4444444hi!aaaaaaaa.. !ih..                                                                                                                                  ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test171");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                 !ih                                                ", "#############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test172");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("Hi!###################################A", "                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test173");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                        aaaaaaaaaaaaaaaaaaaa                                                        ", 42, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                        aaaaaaaaaaaaaaaaaaaa                                                        " + "'", str3.equals("                        aaaaaaaaaaaaaaaaaaaa                                                        "));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test174");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test175");
        int int1 = org.apache.commons.lang.math.NumberUtils.stringToInt("                                               aAA                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test176");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test177");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("aa ", "", 90, (int) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "aa " + "'", str4.equals("aa "));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test178");
        float[] floatArray1 = new float[] { (byte) 1 };
        float float2 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray6 = new float[] { (byte) -1, (-1.0f), (byte) 100 };
        float float7 = org.apache.commons.lang.math.NumberUtils.max(floatArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray6);
        float[] floatArray10 = new float[] { (byte) 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray15 = new float[] { (byte) -1, (-1.0f), (byte) 100 };
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray15);
        float[] floatArray20 = new float[] { (byte) 1 };
        float float21 = org.apache.commons.lang.math.NumberUtils.max(floatArray20);
        float[] floatArray25 = new float[] { (byte) -1, (-1.0f), (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray25);
        float[] floatArray29 = new float[] { (byte) 1 };
        float float30 = org.apache.commons.lang.math.NumberUtils.max(floatArray29);
        float[] floatArray34 = new float[] { (byte) -1, (-1.0f), (byte) 100 };
        float float35 = org.apache.commons.lang.math.NumberUtils.max(floatArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray34);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray34);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray46 = new float[] { (-1.0f), 0, 96, 94, (byte) -1, (-1) };
        float[] floatArray51 = new float[] { 10, (byte) 1, 1L, (byte) -1 };
        float float52 = org.apache.commons.lang.math.NumberUtils.max(floatArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray51);
        float[] floatArray57 = new float[] { (byte) -1, (-1.0f), (byte) 100 };
        float float58 = org.apache.commons.lang.math.NumberUtils.max(floatArray57);
        float[] floatArray60 = new float[] { (byte) 1 };
        float float61 = org.apache.commons.lang.math.NumberUtils.max(floatArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray57, floatArray60);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray60);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray51);
        float float65 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 10.0f + "'", float52 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 100.0f + "'", float58 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 1.0f + "'", float61 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 1.0f + "'", float65 == 1.0f);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test179");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ", 31.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test180");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("hi!                                                                                             ", 32, "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!                                                                                             " + "'", str3.equals("hi!                                                                                             "));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test181");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                4                                                ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test182");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("a                                                hi!                                                 ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a                                                hi!                                                " + "'", str1.equals("a                                                hi!                                                "));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test183");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) 97, (long) 29);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 29L + "'", long3 == 29L);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test184");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join(objArray0, "", 9, (int) ' ');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test185");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaa                          ", "               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test186");
        double[] doubleArray4 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray5);
        double[] doubleArray7 = null;
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray7);
        double[] doubleArray13 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray14 = new double[] {};
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray14);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray21 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray22 = new double[] {};
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray22);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray13, doubleArray16);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray16);
        double[] doubleArray31 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray32 = new double[] {};
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray32);
        double[] doubleArray34 = null;
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test187");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test188");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test189");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("aaa", 36, 32);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test190");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("4444444...", "A###################A########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test191");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getNestedString("Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa", "      ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test192");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test193");
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("###                                                                                       aaaaaaaaa ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test194");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("###                     Aaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test195");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("Hi!   #######################################################################################       A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!   #######################################################################################       a" + "'", str1.equals("hi!   #######################################################################################       a"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test196");
        double[] doubleArray0 = null;
        try {
            double double1 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test197");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("", "A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444", "                             hi!                                   A                             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test198");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444" + "'", str2.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaa4444444444444444444444444444444444                                4444444444444444444444444444444444"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test199");
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("4AHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4AHI!\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test200");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.prechomp("                                                                                   aaaaaaaaa ", "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                   aaaaaaaaa " + "'", str2.equals("                                                                                   aaaaaaaaa "));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test201");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("########################AAAAAAAAAAAAAAAAAAAA########################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test202");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty("aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test203");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("aaaaaaaaa                                                                                        ", "          #############################################################################", 97);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "Hi!                                   A");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("                       AAAAAAAAA", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "aaaaaaaaa" + "'", str8.equals("aaaaaaaaa"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test204");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("...", 3);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "..." + "'", str2.equals("..."));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test205");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chopNewline("!ih");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!ih" + "'", str1.equals("!ih"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test206");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("   #################...   ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################..." + "'", str1.equals("#################..."));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test207");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("             A               ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test208");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa", "", " aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AaaaaaaaaaaaaaaaaaaaAaaaaaaaa" + "'", str3.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test209");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa", 35);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa" + "'", str2.equals("   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test210");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                           ", 34);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                  " + "'", str2.equals("                                  "));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test211");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("aaaaaaaaa                                    ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("aAHI!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test212");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getChomp("hi!", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test213");
        float[] floatArray2 = new float[] { 48, 4 };
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray2);
        float[] floatArray10 = new float[] { 10L, (short) 10, 0.0f, ' ', (-1), '4' };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        java.lang.Class<?> wildcardClass12 = floatArray10.getClass();
        float[] floatArray16 = new float[] { (byte) -1, (-1.0f), (byte) 100 };
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray16);
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray2, floatArray10);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 48.0f + "'", float3 == 48.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test214");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAA", "...aaaaaaa");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAA" + "'", str2.equals("AAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test215");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isDigits("!ih                                                a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test216");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("", "                                            !I AAAAAAAAA                                            ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test217");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test218");
        double[] doubleArray4 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray5);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray13 = new double[] {};
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray13);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray7);
        double double17 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        double double18 = org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
        double double19 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test219");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("###                     aaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###                     aaaaaaaaa" + "'", str2.equals("###                     aaaaaaaaa"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test220");
        java.util.Collection collection0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(collection0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test221");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                                               hi!                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test222");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                         hi!", "aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test223");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Aaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "                                                                                    hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test224");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray16);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.max(byteArray13);
        byte byte20 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte byte21 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray13);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test225");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA" + "'", str1.equals("AAAAAAAAAAAAAAAAAAAA##AAAAAAAAHI!AAAAAAAAAAAAAAAAAAAA##AAAAAAAA"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test226");
        char[] charArray10 = new char[] { 'a', '4', ' ', '4', '#' };
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray10);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                ", charArray10);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("A                                                hi!", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ", charArray10);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test227");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("Aaaaaaaaa ", "......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test228");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chopNewline("                                                                                                     ... !ih");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                                                                     ... !ih" + "'", str1.equals("                                                                                                     ... !ih"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test229");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("4444444hi!aaaaaaaaa", "HI");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HI" + "'", str2.equals("HI"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test230");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("4444444hI!AAAAAAAAA                                                                                        ", "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test231");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("                                                                                       Aaaaaaaaa ", "aaaaaaaaa                                        ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                       Aaaaaaaaa " + "'", str2.equals("                                                                                       Aaaaaaaaa "));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test232");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray16);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray16);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray23);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray23);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.max(byteArray23);
        byte[] byteArray32 = null;
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray32, byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray45, byteArray48);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.min(byteArray48);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray48);
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray58);
        byte byte60 = org.apache.commons.lang.math.NumberUtils.min(byteArray55);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray55);
        byte byte63 = org.apache.commons.lang.math.NumberUtils.max(byteArray55);
        byte byte64 = org.apache.commons.lang.math.NumberUtils.min(byteArray55);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray55);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray55);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 100 + "'", byte31 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -1 + "'", byte50 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 0 + "'", byte60 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 100 + "'", byte63 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 0 + "'", byte64 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 100 + "'", byte66 == (byte) 100);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test233");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("4444444444444444444444444444444444                                4444444444444444444444444444444444", "444444444444444444444444444444444444444444444          444444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "");
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("...                                          ...", strArray3);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a', 0, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test234");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("!i Aaaaaaaaa                                          ", " AAAAAAAAA", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test235");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa                          ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa" + "'", str1.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test236");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("!################################### ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test237");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("           4            ", ' ');
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test238");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitaliseAllWords("          aaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          Aaaaaaaaa " + "'", str1.equals("          Aaaaaaaaa "));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test239");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("", 890, "                                                                                              !iH");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                 " + "'", str3.equals("                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                                                                                              !iH                 "));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test240");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.prechomp("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa", "                                                 !IH                                                ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa" + "'", str2.equals("                             aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test241");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("A!ih", 7);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test242");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.prechomp("aaaaaaaa        ", " aaaaaa");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaa        " + "'", str2.equals("aaaaaaaa        "));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test243");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '#', '4');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3.equals("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test244");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35, (float) 87L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test245");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getPrechomp("...                                    !i aaaaaaaaa                                            ", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test246");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA", "Aaaaaaaaa                          ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA" + "'", str2.equals("!iaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test247");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("aAHI!", "4444444hi!aaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test248");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" ", ' ');
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "AAAAAAAAAAi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4" + "'", str4.equals("4"));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test249");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank("h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test250");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getNestedString("########################AAAAAAAAAAAAAAAAAAAA########################################################", "                                                                              !ih            ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test251");
        short[] shortArray2 = new short[] { (byte) 10, (byte) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        short[] shortArray6 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray6);
        short[] shortArray10 = new short[] { (byte) 10, (byte) -1 };
        short short11 = org.apache.commons.lang.math.NumberUtils.max(shortArray10);
        short[] shortArray14 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray14);
        short short16 = org.apache.commons.lang.math.NumberUtils.min(shortArray10);
        short[] shortArray19 = new short[] { (byte) 10, (byte) -1 };
        short short20 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short[] shortArray23 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray23);
        short short25 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray19);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray19);
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        short[] shortArray32 = new short[] { (byte) -1, (byte) 0, (short) 1 };
        short[] shortArray35 = new short[] { (byte) 10, (byte) -1 };
        short short36 = org.apache.commons.lang.math.NumberUtils.max(shortArray35);
        short[] shortArray39 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray39);
        short[] shortArray43 = new short[] { (byte) 10, (byte) -1 };
        short short44 = org.apache.commons.lang.math.NumberUtils.max(shortArray43);
        short[] shortArray47 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray47);
        short short49 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        short[] shortArray52 = new short[] { (byte) 10, (byte) -1 };
        short short53 = org.apache.commons.lang.math.NumberUtils.max(shortArray52);
        short[] shortArray56 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray56);
        short short58 = org.apache.commons.lang.math.NumberUtils.max(shortArray52);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray52);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray52);
        short short61 = org.apache.commons.lang.math.NumberUtils.min(shortArray52);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray52);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray32);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -1 + "'", short28 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 10 + "'", short36 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 10 + "'", short44 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) -1 + "'", short49 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 10 + "'", short53 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 10 + "'", short58 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) -1 + "'", short61 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test252");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aa", 35, 4);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test253");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("aaaaaaaaa                                       ", "                                                hi!                                                 ", "   #######################################################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaaaaaa                                       " + "'", str3.equals("aaaaaaaaa                                       "));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test254");
        double[] doubleArray4 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray5);
        double[] doubleArray11 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray12 = new double[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray12);
        double[] doubleArray14 = null;
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray14);
        double[] doubleArray21 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray22 = new double[] {};
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray21);
        double[] doubleArray25 = null;
        double[] doubleArray30 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray31 = new double[] {};
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray31);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray25);
        double[] doubleArray39 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray40 = new double[] {};
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray40);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray47 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray48 = new double[] {};
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray47, doubleArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray48);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray42);
        double double52 = org.apache.commons.lang.math.NumberUtils.max(doubleArray39);
        double[] doubleArray57 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray58 = new double[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray58);
        double[] doubleArray60 = new double[] {};
        double[] doubleArray65 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray66 = new double[] {};
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray65, doubleArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray60, doubleArray66);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray60);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray57);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray57);
        double double72 = org.apache.commons.lang.math.NumberUtils.min(doubleArray57);
        double double73 = org.apache.commons.lang.math.NumberUtils.min(doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 35.0d + "'", double52 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test255");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank("a a a a a a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test256");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("... !ih...aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "... !IH...AAAAAAAAAAAAAAAAAAAA" + "'", str1.equals("... !IH...AAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test257");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getNestedString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai", "#################...", "Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test258");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test259");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("4                                                ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test260");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Aaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test261");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat(" a                                                                                       ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test262");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("A4 ", "h");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "h" + "'", str2.equals("h"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test263");
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("########################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test264");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test265");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                 ", "hA         A         A         A         A         A         A         A         A         A       i!##a##a#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test266");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("Aaaaaaaaa ", "                                   ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "#######################################################################################");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Aaaaaaaaa" + "'", str5.equals("Aaaaaaaaa"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test267");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getPrechomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##a");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test268");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("####################", "a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test269");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                aaaaaaaaa                  ", 34, '#');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                aaaaaaaaa                  " + "'", str3.equals("                aaaaaaaaa                  "));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test270");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                    ##A       hi!                    ##A       ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                    ##A       hi!                    ##A       " + "'", str1.equals("                    ##A       hi!                    ##A       "));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test271");
        java.util.Collection collection0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(collection0, "a ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test272");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, 134.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 134.0f + "'", float3 == 134.0f);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test273");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("4444444hi!aaaaaaaaa                        ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test274");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split(" AAAAAA...", '4');
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "           4            ", 93, 88);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test275");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("A", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test276");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaa", "                                              hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test277");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("aaaaaaaaa                                                                                        ", "aaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "                                                                                        " + "'", str6.equals("                                                                                        "));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test278");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("", 'a', 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test279");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                         I!                         ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                         I!                         " + "'", str1.equals("                         I!                         "));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test280");
        char[] charArray5 = new char[] { '4', '4', '#' };
        boolean boolean6 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAnyBut("Hi!                                                                                             ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test281");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("         ", '#');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "         " + "'", str2.equals("         "));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test282");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getChomp("", "  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test283");
        try {
            java.lang.Double double1 = org.apache.commons.lang.math.NumberUtils.createDouble("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test284");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray0, "");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test285");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("", 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          " + "'", str2.equals("          "));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test286");
        long[] longArray0 = null;
        long[] longArray1 = null;
        long[] longArray3 = new long[] { '#' };
        long[] longArray7 = new long[] { 97, (-1), ' ' };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray3);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray3);
        long[] longArray12 = new long[] { '#' };
        long[] longArray16 = new long[] { 97, (-1), ' ' };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray12);
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray12);
        java.lang.Class<?> wildcardClass22 = longArray12.getClass();
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray12);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test287");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("HI!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test288");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chopNewline("4AHI!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4AHI!" + "'", str1.equals("4AHI!"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test289");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("##########################################                         i!", 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##########################################                         i!" + "'", str2.equals("##########################################                         i!"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test290");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("aaaaaaaaa ", 0, "###                     Aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaaaaaa " + "'", str3.equals("aaaaaaaaa "));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test291");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("HI!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HI!" + "'", str1.equals("HI!"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test292");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray9 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray2, intArray9);
        int[] intArray17 = new int[] { '4', (short) 100, (short) 100, 52, (byte) 1, (short) 100 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int[] intArray24 = new int[] { 0, 10, (short) -1, (byte) -1, 94 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray24);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int int27 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test293");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("      ...", " AAAAAA...", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test294");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                                           ... !ih", 0, 99);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                           ... !ih" + "'", str3.equals("                                           ... !ih"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test295");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...               ...                          ...");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test296");
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("hi!                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test297");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 3, (double) 108L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test298");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test299");
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("                                    aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa                                       hi!\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test300");
        double[] doubleArray4 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray5);
        double[] doubleArray11 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray12 = new double[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray12);
        double[] doubleArray18 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray19 = new double[] {};
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray18, doubleArray19);
        double[] doubleArray21 = null;
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray21);
        double[] doubleArray28 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray29 = new double[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray28);
        double[] doubleArray32 = null;
        double[] doubleArray37 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray38 = new double[] {};
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray32, doubleArray38);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double[] doubleArray46 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray47 = new double[] {};
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray47);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray54 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray55 = new double[] {};
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray55);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray49);
        double double59 = org.apache.commons.lang.math.NumberUtils.max(doubleArray46);
        double[] doubleArray64 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray65 = new double[] {};
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray65);
        double[] doubleArray67 = new double[] {};
        double[] doubleArray72 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray73 = new double[] {};
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray72, doubleArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray67, doubleArray73);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray67);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray64);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray64);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray28);
        try {
            double double80 = org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 35.0d + "'", double59 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test301");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("", "                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test302");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("                            aaaaaaaaaaaaaaaaaaaa                                ", "hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test303");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("", "                                     Hi!   #######################################################################################             ######       A                                      hi!                                                 ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                     Hi!   #######################################################################################             ######       A                                      hi!                                                 " + "'", str2.equals("                                     Hi!   #######################################################################################             ######       A                                      hi!                                                 "));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test304");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("##A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "##a" + "'", str1.equals("##a"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test305");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("##a");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                     Hi!   #######################################################################################             ######       A                                      hi!                                                 ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test306");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty("A4 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test307");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("    !I       A         A         A         A         A         A         A         A         A         A", "                                                                                              !iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test308");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("AAAAAAAAAAAAAAAAAAAA                                                        i!", "4444444...", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test309");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test310");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("a                                                hi!                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test311");
        float[] floatArray0 = null;
        float[] floatArray7 = new float[] { 10L, (short) 10, 0.0f, ' ', (-1), '4' };
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray7);
        java.lang.Class<?> wildcardClass9 = floatArray7.getClass();
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray7);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray7);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test312");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray6);
        byte byte8 = org.apache.commons.lang.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.max(byteArray3);
        java.lang.Class<?> wildcardClass11 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test313");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A" + "'", str1.equals("Aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test314");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray6 = new double[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray6);
        try {
            double double9 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test315");
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("!ih aA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih aA\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test316");
        try {
            java.lang.String str4 = org.apache.commons.lang.StringUtils.overlayString("                                     ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 88");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test317");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test318");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test319");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaa                                ", 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                " + "'", str2.equals("                                "));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test320");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("                                                ...                          ......                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test321");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai", "aaaaaaaa        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test322");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("44444444444444444444444        ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test323");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { '4', 0, (byte) 0 };
        int[] intArray7 = new int[] { 100, 1 };
        int[] intArray14 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray7, intArray14);
        int[] intArray22 = new int[] { '4', (short) 100, (short) 100, 52, (byte) 1, (short) 100 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray14, intArray22);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray22);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray22);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray4);
        try {
            int int29 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test324");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                    ", 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                                    " + "'", str2.equals("                                                                                                    "));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test325");
        java.util.Iterator iterator0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(iterator0, "                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test326");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("!################################### ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test327");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("... !ih...aaaaaaaaaaaaaaaaaaaa                                ", 95);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 ... !ih...aaaaaaaaaaaaaaaaaaaa                                " + "'", str2.equals("                                 ... !ih...aaaaaaaaaaaaaaaaaaaa                                "));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test328");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("!ih", "HHHHHHHHHHHHHHHHHHHHH", 20);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test329");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteSpaces("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test330");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test331");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("AaaaaaaaaaaaaaaaaaaaAaaaaaaaa", "A         A         A         A         A         A         A         A         A         A       i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test332");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getChomp("aaaaaaaaa ", "...                    A");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test333");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimitedString("                                              hi!", "                          aaaaaaaaA");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test334");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("           4            ", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "           4            " + "'", str2.equals("           4            "));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test335");
        int int1 = org.apache.commons.lang.math.NumberUtils.stringToInt("4444444444444          444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test336");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test337");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("aaaaaaaaa                                    ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test338");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("iaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaA", "Hi!                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test339");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a", "Aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa", "           HI!            ");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a" + "'", str3.equals("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test340");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("            hi!            ", 108);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "            hi!            " + "'", str2.equals("            hi!            "));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test341");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                           ... !ih");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                           ... !ih" + "'", str1.equals("                                           ... !ih"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test342");
        long[] longArray1 = new long[] { '#' };
        long[] longArray5 = new long[] { 97, (-1), ' ' };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray5);
        long[] longArray8 = new long[] { '#' };
        long[] longArray12 = new long[] { 97, (-1), ' ' };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray8);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test343");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("", 31, 81);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test344");
        long[] longArray4 = new long[] { 10L, 35L, '#', 1L };
        long long5 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long[] longArray6 = null;
        long[] longArray8 = new long[] { '#' };
        long[] longArray12 = new long[] { 97, (-1), ' ' };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray8);
        long[] longArray17 = new long[] { '#' };
        long[] longArray21 = new long[] { 97, (-1), ' ' };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray21);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray17);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray17);
        long long27 = org.apache.commons.lang.math.NumberUtils.min(longArray17);
        long[] longArray28 = null;
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray28);
        long[] longArray30 = null;
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray17);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test345");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlayString("hA         A         A         A         A         A         A         A         A         A       i!##a##a#", "   #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa", 27, 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hA         A         A        #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaahA         A         A         A         A         A         A         A         A         A       i!##a##a#" + "'", str4.equals("hA         A         A        #############################aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa#############################################################aaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaahA         A         A         A         A         A         A         A         A         A       i!##a##a#"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test346");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("#################...", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test347");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlayString("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai", "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa", 41, 93);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaaaaaaaaaaaaaa##AaaaaaaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai" + "'", str4.equals("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaaaaaaaaaaaaaa##AaaaaaaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa AaaaaaaaiAaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test348");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 29L, (float) (byte) -1, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test349");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                                       Aaaaaaaaa ", "a a a a a a");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                       Aaaaaaaaa " + "'", str2.equals("                                                                                       Aaaaaaaaa "));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test350");
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test351");
        char[] charArray7 = new char[] { ' ', ' ' };
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ", charArray7);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("hi!                                   A", charArray7);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAnyBut("", charArray7);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaa ", charArray7);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaai!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test352");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("4444444444444444444444444444444444                                4444444444444444444444444444444444", "!i Aaaaaaaaa                                          ", 51);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test353");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (short) 10, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test354");
        double[] doubleArray5 = new double[] { 41, 97, 90, 9L, 90L };
        double double6 = org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test355");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (-1.0d), 41, 24.0d, 36, 48L };
        double double7 = org.apache.commons.lang.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang.math.NumberUtils.max(doubleArray6);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 48.0d + "'", double8 == 48.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test356");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray9 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray2, intArray9);
        int[] intArray17 = new int[] { '4', (short) 100, (short) 100, 52, (byte) 1, (short) 100 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int[] intArray24 = new int[] { 0, 10, (short) -1, (byte) -1, 94 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray24);
        int[] intArray28 = new int[] { 100, 1 };
        int[] intArray35 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray35);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray35);
        int int39 = org.apache.commons.lang.math.NumberUtils.max(intArray35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test357");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("a ", 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test358");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("4                                                ", "...                    A");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test359");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A                ", " a                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test360");
        double[] doubleArray4 = new double[] { (-1.0f), '#', 1.0f, 35L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray5);
        double double7 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test361");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getNestedString(" a                                                                                       ", " aaaaaa", "Aaaaaaaaa                          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test362");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("Aaaaaaaaa ", "                                   ");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test363");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 21);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test364");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("4444444444444          444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4444444444444          444444444444444444444444444444444444" + "'", str1.equals("4444444444444          444444444444444444444444444444444444"));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test365");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                          aaaaaaaaA", "                aaaaaaaaa                  ", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test366");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("   #######################################################################################", "aaaaaaaaaaaaaaaaaaaa  Aaaaaaaaa", 20);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test367");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split(".. !ih..                                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test368");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("44444444444444444444444444444                                                HI!", "Aaaaaaaaa i!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test369");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("aaaaaaaaai!   ", "A         A         A         A         A         A         A         A         A         A       I!    ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaai!   " + "'", str2.equals("aaaaaaaaai!   "));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test370");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test371");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("", "A         A         A         A         A         A         A         A         A         A       I!    ", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test372");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("#########");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test373");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getNestedString("                          aaaaaaaaA", "aaaaaaa                                                    aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test374");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("    !I       A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "    !i       a         a         a         a         a         a         a         a         a         a" + "'", str1.equals("    !i       a         a         a         a         a         a         a         a         a         a"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test375");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("                                                ", "                                                            AAAAAAAAA                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test376");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.escape("aaaaaaaaa                          44444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaa                          44444444444444444444444444444444444444444444444444444444444" + "'", str1.equals("aaaaaaaaa                          44444444444444444444444444444444444444444444444444444444444"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test377");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                         HI!", "A!ih", "44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                         HI!" + "'", str3.equals("                         HI!"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test378");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("    !I       A         A         A         A         A         A         A         A         A         A", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test379");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test380");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalise("44444444444444444444444444444                                                HI!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "44444444444444444444444444444                                                HI!" + "'", str1.equals("44444444444444444444444444444                                                HI!"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test381");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4                                                ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "aaaaaaaaai!   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test382");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                   ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test383");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("             ", "A         A         A         A         A         A         A         A         A         A", "Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test384");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA" + "'", str1.equals("...aaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA aaaaaaaaA"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test385");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444Hi!", "                                                HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test386");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimitedString("aaaaaaaaa i!", "aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAA aAAAAAAAI!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "i" + "'", str2.equals("i"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test387");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("... !IH...                      aAAAAAAAAaAAAAAAAAaAAAAAAAAaA... !IH...                       ", "###                     aaaaaaaaa                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test388");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                                    AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test389");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("...", "HI!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "..." + "'", str2.equals("..."));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test390");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("... !IH...AAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "... !IH...AAAAAAAAAAAAAAAAAAAA" + "'", str1.equals("... !IH...AAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test391");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalise("                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!" + "'", str1.equals("                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!                                                hi!"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test392");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("IaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA AaaaaaaaA", "aaaa...", 82);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                                                                                  HI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 117 + "'", int5 == 117);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test393");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("aaaaaaaaa", (double) 94.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 94.0d + "'", double2 == 94.0d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test394");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a", 0, 890);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a" + "'", str3.equals("a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test395");
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("..!ih..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"..!ih..\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test396");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { '#' };
        long[] longArray6 = new long[] { 97, (-1), ' ' };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray11 = new long[] { '#' };
        long[] longArray15 = new long[] { 97, (-1), ' ' };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray11);
        long long21 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long[] longArray22 = null;
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray22);
        long[] longArray24 = null;
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray24);
        long long26 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test397");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("        aaaaaaaaaaaaaaaaaaaa        ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "        aaaaaaaaaaaaaaaaaaaa        " + "'", str1.equals("        aaaaaaaaaaaaaaaaaaaa        "));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test398");
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.lang.StringUtils.indexOfAnyBut("", charArray2);
        boolean boolean4 = org.apache.commons.lang.StringUtils.containsOnly("i", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test399");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("AAAAAAAAA ", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test400");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("aahi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aahi!" + "'", str1.equals("aahi!"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test401");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("         A", "                                          a!i ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "         A" + "'", str2.equals("         A"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test402");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("!iH", '4');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!iH" + "'", str2.equals("!iH"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test403");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("   a", "    !i       a         a         a         a         a         a         a         a         a         a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test404");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("                                                              ", 48);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                              " + "'", str2.equals("                                                              "));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test405");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test406");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 37, 0.0d, (double) 43L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test407");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("4444444hI AAAAAAAAA", "###                     aaaaaaaaa                  A         A         A         A         A         A         A         A         A         A                      ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test408");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                                                            ", "A         A         A         A         A         A         A         A         A         A       i!    ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                            " + "'", str2.equals("                                                            "));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test409");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test410");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4444444444444        4444444hi!aaaaaaaaa                                                                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test411");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("             a               ", "aaaaaaaaaaaaaaaaaaaa", "", 117);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "             a               " + "'", str4.equals("             a               "));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test412");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("                   ", "            hi!            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test413");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                                aaaaaaaaaa", "aaaaaaaaAaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                aaaaaaaaaa" + "'", str2.equals("                                                                                aaaaaaaaaa"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test414");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("           4            ", "Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa", 82, 2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "  Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa" + "'", str4.equals("  Aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaa"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test415");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(54, 42, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54 + "'", int3 == 54);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test416");
        java.util.Collection collection0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(collection0, "44444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test417");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("4444444Hi!                     ", 54);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4444444Hi!                     " + "'", str2.equals("4444444Hi!                     "));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test418");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("......");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "......" + "'", str1.equals("......"));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test419");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                                                HI!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HI!" + "'", str1.equals("HI!"));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test420");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { '#' };
        long[] longArray6 = new long[] { 97, (-1), ' ' };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray2);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        long[] longArray11 = null;
        long[] longArray13 = new long[] { '#' };
        long[] longArray17 = new long[] { 97, (-1), ' ' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray17);
        long[] longArray20 = new long[] { '#' };
        long[] longArray24 = new long[] { 97, (-1), ' ' };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray24);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long[] longArray29 = new long[] { '#' };
        long[] longArray33 = new long[] { 97, (-1), ' ' };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray33);
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray33);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray17);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray11);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test421");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                HI!", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test422");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("... !ih...", 'a', 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test423");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa", "...                                          ..");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test424");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!", 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!" + "'", str2.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test425");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("... !ih..                                           ", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test426");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                ", '4');
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, ' ', 93, 48);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test427");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("AaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test428");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("A         A         A        ", (double) 37);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.0d + "'", double2 == 37.0d);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test429");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "   ", 890);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test430");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(93.0d, 0.0d, (double) 90);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.0d + "'", double3 == 93.0d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test431");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("A         A         A        ", "            hi!            ", "                   ");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A         A         A        " + "'", str3.equals("A         A         A        "));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test432");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "hi!", (int) (byte) 100);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String str7 = org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test433");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("... !ih..", " a                                                                                       ", 0, 47);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + " a                                                                                       " + "'", str4.equals(" a                                                                                       "));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test434");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaaaaaaaaaaaaaaa##Aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test435");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                                              !ih            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test436");
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("... !ih...                      AaaaaaaaaAaaaaaaaaAaaaaaaaaAa... !ih...                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"... \"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test437");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("           ... !ih...           ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "           ...hi! ...           " + "'", str1.equals("           ...hi! ...           "));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test438");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HHHHHHHHHHHHHHHHHHHHH", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test439");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("", "... !ih...", 0, 3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "... !ih..." + "'", str4.equals("... !ih..."));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test440");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                                                                aaaaaaaaaa", 88);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                aaaaaaaa" + "'", str2.equals("                                                                                aaaaaaaa"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test441");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteSpaces("A                                                HI!                                                 ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AHI!" + "'", str1.equals("AHI!"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test442");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("aaaaaaaaaa                        ", "", 48, 42);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "aaaaaaaaaa                        " + "'", str4.equals("aaaaaaaaaa                        "));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test443");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa", ' ');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaa##Aaaaaaaahi!aaaaaaaaaaaaaaaaaaaa##Aaaaaaaa"));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test444");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("AAAAAAAAA", "                        AAAAAAAAAAAAAAAAAAAA                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 91 + "'", int2 == 91);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test445");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test446");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getNestedString("A", "#######################################################################################             ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test447");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "Hi!", 96);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test448");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                                                 !IH                                                ", "... !ih...                                ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "IH" + "'", str2.equals("IH"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test449");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("AA                                  ", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test450");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("!i aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!i aaaaaaaaa" + "'", str1.equals("!i aaaaaaaaa"));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test451");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test452");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("           ... !ih...           ", "aaaaaaaaa                          44444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77 + "'", int2 == 77);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test453");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("!iH", "#######################################################################################          ", "aaaaaaaaaaaaaaaaaaaaAaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test454");
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test455");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference(" aaaaaaaaaaaaaaaaaaaa  aaaaaaaaa ", "                                            !I AAAAAAAAA                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test456");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("4444444444444444444444444444444444                                4444444444444444444444444444444444", (int) (byte) 100, '4');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4444444444444444444444444444444444                                4444444444444444444444444444444444" + "'", str3.equals("4444444444444444444444444444444444                                4444444444444444444444444444444444"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test457");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("i!", strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "          ");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, ' ', 96, 95);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test458");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("A444 A44444444 A44444444 A44444444 A44444444 A44444444 A44444444", "                     4444444Hi!                     ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test459");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { '#' };
        long[] longArray6 = new long[] { 97, (-1), ' ' };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray6);
        long[] longArray9 = new long[] { '#' };
        long[] longArray13 = new long[] { 97, (-1), ' ' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray9);
        long[] longArray18 = new long[] { '#' };
        long[] longArray22 = new long[] { 97, (-1), ' ' };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray22);
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long long26 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray22);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray6);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test460");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chompLast("", "aaa");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test461");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                         hi!", 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                         hi!" + "'", str2.equals("                         hi!"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test462");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chopNewline("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test463");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                                                                                                ", "4444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                                                " + "'", str2.equals("                                                                                                "));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test464");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("AAAAAAAAAAAAAAAAAAAA  aAAAAAAAA                                       HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test465");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("A", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test466");
        char[] charArray6 = new char[] { ' ', ' ' };
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ", charArray6);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa ", charArray6);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("##A", charArray6);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("##a", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test467");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.split("", "hi!", (int) (byte) 100);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang.StringUtils.lastIndexOfAny("Aaaaaaaaa", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray5);
        int int9 = org.apache.commons.lang.StringUtils.lastIndexOfAny("", strArray5);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, "             a               ", (int) (short) 100, 31);
        java.lang.String[] strArray14 = org.apache.commons.lang.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test468");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("aAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAI!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAI!" + "'", str1.equals("aAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAI!"));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test469");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("aaaaaaaaaa", "##Aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test470");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitaliseAllWords("44444444444444444444444444444                                                HI!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "44444444444444444444444444444                                                HI!" + "'", str1.equals("44444444444444444444444444444                                                HI!"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test471");
        short[] shortArray2 = new short[] { (byte) 10, (byte) -1 };
        short short3 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        short[] shortArray6 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray6);
        short short8 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray11 = new short[] { (byte) 10, (byte) -1 };
        short short12 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        short[] shortArray15 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray15);
        short short17 = org.apache.commons.lang.math.NumberUtils.max(shortArray11);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray11);
        short[] shortArray21 = new short[] { (byte) 10, (byte) -1 };
        short short22 = org.apache.commons.lang.math.NumberUtils.max(shortArray21);
        short[] shortArray25 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray25);
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        short short28 = org.apache.commons.lang.math.NumberUtils.max(shortArray21);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray21);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short[] shortArray33 = new short[] { (byte) 10, (byte) -1 };
        short short34 = org.apache.commons.lang.math.NumberUtils.max(shortArray33);
        short[] shortArray37 = new short[] { (byte) 1, (byte) 1 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray33, shortArray37);
        short short39 = org.apache.commons.lang.math.NumberUtils.max(shortArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray33);
        short short41 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
        short short42 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 10 + "'", short28 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 10 + "'", short34 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 10 + "'", short39 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) -1 + "'", short41 == (short) -1);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test472");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray16);
        byte byte18 = org.apache.commons.lang.math.NumberUtils.min(byteArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray16);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) -1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray23, byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray23);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray7, byteArray23);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.max(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) -1 + "'", byte31 == (byte) -1);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test473");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("                            aaaaaaaaaaaaaaaaaaaa                                ", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                            aaaaaaaaaaaaaaaaaaaa                                " + "'", str2.equals("                            aaaaaaaaaaaaaaaaaaaa                                "));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test474");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test475");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test476");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("...                                          HI!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test477");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(80L, (long) 21, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 80L + "'", long3 == 80L);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test478");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                          AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa", "   #######################################################################################");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "##########################A        A        A        A        " + "'", str3.equals("##########################A        A        A        A        "));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test479");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                             hi!                                   A                             ", 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                             hi!                                   A                             " + "'", str2.equals("                             hi!                                   A                             "));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test480");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.clean("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A" + "'", str1.equals("aaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa Aaaaaaaaa A"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test481");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("           HI!            ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test482");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(9, 12, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test483");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("", "        aaaaaaaaaaaaaaaaaaaa        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test484");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("                                           ... !ih", 13);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih" + "'", str2.equals("                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih                                           ... !ih"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test485");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray0, "a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test486");
        char[] charArray8 = new char[] { ' ', ' ' };
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("                                                hi!                                                 ", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaa ", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("##A", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("Aa hi!", charArray8);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444444444444444444444444444                                4444444444444444444444444444444444", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test487");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("A4 ", ' ', 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test488");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                        ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test489");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai", "a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai" + "'", str2.equals("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaai"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test490");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("AaaaaaaaaAaaaaaaaaAaaaaaaaaAa", ' ', 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test491");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("Aa hi!Aa hi!Aa hi!Aa ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test492");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("4444444Hi!aaaaaaaa.. !ih..                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test493");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaa", "                                  ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test494");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("AaaaaaaaaAaaaaaaaaAaaaaaaaaAaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test495");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray9 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray2, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int14 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray17 = new int[] { 100, 1 };
        int[] intArray24 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray24);
        int[] intArray32 = new int[] { '4', (short) 100, (short) 100, 52, (byte) 1, (short) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray32);
        int[] intArray36 = new int[] { 100, 1 };
        int[] intArray43 = new int[] { (byte) -1, 100, (short) 0, 100, '#', 100 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray43);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test496");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test497");
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("          4444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     \"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test498");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd(" a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia           ", "aAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAAaAAAAAAAI!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia           " + "'", str2.equals(" a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia            a hia a hia a hia a hia a hia a hia           "));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test499");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("aa ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " aa" + "'", str1.equals(" aa"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test500");
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("...aaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }
}

