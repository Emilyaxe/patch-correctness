package entity;


import java.util.List;


import com.alibaba.fastjson.JSONObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Method {

    private int _startLine;
    private int _endLine;



    public static List<Method> parse(String str) {
        return JSONObject.parseArray(str, Method.class);
    }
}
