package day15_practice_tasks;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));

        removeDuplicates(numbers);

        Set<Integer> numbers1 = new TreeSet<>(numbers);
        System.out.println(numbers1);


        Iterator<Integer> it = numbers.iterator();


    }

    public static void removeDuplicates(List<Integer> numbers) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer each : numbers) {
            if (uniqueList.contains(each)) {
                continue;
            }
            uniqueList.add(each);
        }
        numbers.clear();
        numbers.addAll(uniqueList);
    }
}