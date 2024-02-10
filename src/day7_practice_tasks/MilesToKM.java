package day7_practice_tasks;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner milesToKM = new Scanner(System.in);
        System.out.println("Enter the miles: ");
        double miles = milesToKM.nextDouble();
        double km = miles *1.609;
        System.out.println(miles+ " miles is equal to " + km + " kilometers");


    }
}
