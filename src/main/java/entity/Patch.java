package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patch {
    String lable;
    String tool;
    String bugid;
    String patchName;
    String content;
    String patchPath;
    String combinedMethod;
    String fixedFile;
    boolean deleteAll = false;

    public Patch(String lable, String tool, String bugid, String patchName) {
        this.lable = lable;
        this.tool = tool;
        this.bugid = bugid;
        this.patchName = patchName;
    }

    public Patch(String lable, String tool, String bugid, String patchName, String content) {
        this.lable = lable;
        this.tool = tool;
        this.bugid = bugid;
        this.patchName = patchName;
        this.content = content;
    }
}
