package entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;

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
public class PatchJson {

    private String patchName;
    private String label;
    private String bugId;
    private String combinedMethod;
    @JSONField(serialize = false)
    private String patchPath;
    private Set<String> failingTests;
    private Map<String, List<String>> buggyTraceInfo;
    private Map<String, List<String>> fixedTraceInfo;

}
