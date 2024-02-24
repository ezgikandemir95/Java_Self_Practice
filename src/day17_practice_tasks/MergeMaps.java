package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {
        Map<Character,Integer> map1 = new HashMap<>();
        map1.put('A',10);
        map1.put('B',20);

        Map<Character,Integer> map2 = new HashMap<>();
        map2.put('B',30);
        map2.put('C',40);

        Map<Character,Integer> mergedMap = new HashMap<>(map1);


        for (Map.Entry<Character, Integer> map2Entry : map2.entrySet()) {
            char key = map2Entry.getKey();
            int value = map2Entry.getValue();

            if (mergedMap.containsKey(key)){                        // if both contains same key
                mergedMap.put(key,mergedMap.get(key) + value);   // add map2 key and map1 key value
            }else{
                mergedMap.put(key,value);                       // else if not present add to mergeMap
            }
        }
        System.out.println(mergedMap);

    }
}
