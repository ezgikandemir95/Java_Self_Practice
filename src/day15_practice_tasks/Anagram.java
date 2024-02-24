package day15_practice_tasks;

import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "ccddabaa" ;

        Set<Character> set1 = new HashSet<>();
        for (char a : str1.toCharArray()) {
            set1.add(a);
        }

        Set<Character> set2 = new HashSet<>();
        for (char b : str2.toCharArray()) {
            set1.add(b);
        }

        boolean result = set1.equals(set2);
        System.out.println(result);


        String str3 = "xyze";
        String str4 = "xyzd" ;

        Set<Character> set3 = new HashSet<>();
        for (char c : str3.toCharArray()) {
            set1.add(c);
        }

        Set<Character> set4 = new HashSet<>();
        for (char d : str4.toCharArray()) {
            set1.add(d);
        }

        boolean result1 = set3.equals(set4);
        System.out.println(result1);


    }

}

