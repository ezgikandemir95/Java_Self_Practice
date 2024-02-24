package day15_practice_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 5));

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(2, 3, 4));

        Set<Integer> result = new HashSet<>();
        result.addAll(set);
        result.addAll(set1);

        result.removeAll(set1);
        System.out.println(result);

    }


}

