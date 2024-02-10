package day7_practice_tasks;

import java.util.Scanner;

public class FamilyMembers {
    public static void main(String[] args) {
        Scanner scanFamily = new Scanner(System.in);
        int familyMembers;
        System.out.println("How many people do you live with?");

        familyMembers= scanFamily.nextInt();
        if (familyMembers<= 3){
            System.out.println("Live with less than three people");
            return;}
        else if (familyMembers<=6){
            System.out.println("Live with 3 - 6 people");
            return;}
        else {
            System.out.println("Live with more than six people.");
    }
        scanFamily.close();

}
    }

