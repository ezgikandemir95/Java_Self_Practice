package day17_practice_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

            String str = "aabcccdeeeef";

            Map<Character,Integer> map = new LinkedHashMap<>();

            // get the frequency of the char first
            for (char each : str.toCharArray()) {       // to access each character

                if (map.containsKey(each)){             // get the frequency of each char
                    map.put(each,map.get(each) + 1);
                }else{
                    map.put(each,1);
                }
            }
            System.out.println(map);


            //create a map that will store unique characters

            Map <Character,Integer> uniqueMap = new LinkedHashMap<>();

            for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {     // access each entry
                if (eachEntry.getValue() == 1){                                // if entry's value is equal to one
                    uniqueMap.put(eachEntry.getKey(), eachEntry.getValue());    // then add key and value to uniqueMap
                }
            }
            System.out.println(uniqueMap);
        }
    }
