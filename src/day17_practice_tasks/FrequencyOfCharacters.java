package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "bbcccaaaaa";

        Map<Character, Integer> map= new HashMap<>();

        for (char each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            }else { map.put(each, 1);
            }
        }
        System.out.println(map);
    }

}