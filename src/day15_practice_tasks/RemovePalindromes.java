package day15_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList(
                    "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                    "reviver", "racecar", "madam"
            ));

            String reverseList = new StringBuilder(list.toString()).reverse().toString();


            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String temp = it.next();
                if (reverseList.contains(temp)) {
                    it.remove();
                }
            }

            System.out.println(list);


        }

    }
