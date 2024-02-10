package day7_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner product = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String item = product.nextLine();
        System.out.println("Enter the price: ");
        double price = product.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = product.nextInt();
        product.nextLine();
        System.out.println("Enter your first name: ");
        String firstName = product.nextLine();
        double total = quantity*price;
        product.close();
        System.out.println( firstName+ " , your order for "+ quantity + " " + item + " has been placed. " + "Your total is " + total + ".");


    }
}

