package day17_practice_tasks;

import java.util.*;

public class MultiplyOdds {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        System.out.println(map);

        for (Map.Entry<String,Integer> eachEntry : map.entrySet()){
            if (eachEntry.getValue() %2 ==1){
                map.put(eachEntry.getKey(), eachEntry.getValue()*2);

            }
        }
        System.out.println(map);
    }
}



