package script;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import entity.Subject;

public class MulThreadTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Chart", 26);
        map.put("Closure", 133);
        map.put("Math", 106);
        map.put("Lang", 65);
        map.put("Time", 27);
    for(Entry<String,Integer> entry: map.entrySet()){
        String name = entry.getKey();
        Integer end = entry.getValue();
        for (int i = 1; i <= end; i++){
            Subject subject = new Subject(name, i);
        }
     }
    }
}
