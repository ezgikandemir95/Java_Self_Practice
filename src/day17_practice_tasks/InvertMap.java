package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        Map<String, Integer> invertMap = new HashMap<>();

        for (Map.Entry<Integer, String> eachEntry : map.entrySet()) {
            String key = eachEntry.getValue();
            int value = eachEntry.getKey();

            invertMap.put(key,value);
        }
        System.out.println(invertMap);
    }
}

