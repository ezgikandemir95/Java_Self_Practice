package day004_practice_tasks;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 42;

        if (age <= 20) {
            System.out.println("Teenager");}
            else if (age <= 39 ){
                System.out.println("Young aged adults");}
            else if ( age <= 49){
                System.out.println("Young Middle-Aged Adult");}
            else if (age <= 69){
                System.out.println("Age Adult");}
            else if (age <= 70){
                System.out.println("Old Adult");}
            else {
                System.out.println("Invalid aged");}

        }
}
