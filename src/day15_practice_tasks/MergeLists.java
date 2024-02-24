package day15_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println(list3);





    }


    public static void removeDuplicate(List<Integer> list3){

        List<Integer> uniqulist = new ArrayList<>();


        for (Integer each : list3){
            if (uniqulist.contains(each)){
                continue;
            } uniqulist.add(each);

            list3.clear();
            list3.addAll(uniqulist);


        }

    }
}
