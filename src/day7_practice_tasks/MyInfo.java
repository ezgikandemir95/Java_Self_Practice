package day7_practice_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner myInfo = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = myInfo.nextInt();
        System.out.println("Enter your gender: ");
        String gender= myInfo.next();
        myInfo.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = myInfo.nextLine();
        System.out.println("Enter your phone number: ");
        long phoneNumber = myInfo.nextLong();
        System.out.println("Enter your zip code: ");
        int zipCode = myInfo.nextInt();
        System.out.println("Enter your school name: ");
        String schoolName = myInfo.nextLine();
        System.out.println("Enter your city name: ");
        String cityName = myInfo.nextLine();
        System.out.println("Enter your state name: ");
        String stateName = myInfo.nextLine();
        myInfo.nextLine();
        System.out.println("Enter your building number: ");
        int buildingNumber = myInfo.nextInt();
        System.out.println("Enter your street name: ");
        String streetName = myInfo.nextLine();
        myInfo.close();
        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println("Address: " +"\n\t" + buildingNumber +" " + streetName+ "\n\t" + cityName+ " ," +
                "" + "," +stateName + " " + zipCode);


    }
}
