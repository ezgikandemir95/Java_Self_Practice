package day8_practice_task;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                tipCalculator(scanner);
            }

            public static void tipCalculator(Scanner scanner) {


                System.out.println("Split or No split(Yes or No)?");
                String decision = scanner.next();

                System.out.println("Enter the number of people:");
                int people = scanner.nextInt();

                System.out.println("Enter the check amount:");
                double amount = scanner.nextDouble();

                System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
                String quality = scanner.next();

                scanner.close();

                double totalTip = 0;
                String result = "";



                if (quality.equals("Poor")) {
                    totalTip = amount * 0.05;
                } else if (quality.equals("Fair")) {
                    totalTip = amount * 0.10;
                } else if (quality.equals("Good")) {
                    totalTip = amount * 0.15;
                } else if (quality.equals("Great")) {
                    totalTip = amount * 0.20;

                } else if (quality.equals("Excellent")) {
                    totalTip = amount * 0.25;
                }
                double totalToPay = amount + totalTip;
                double totalPerPerson = totalToPay / people;
                double tipPerPerson = totalTip / people;
                result = "\tNumber of people entered: " + people + "\n\tTotal to pay: $" + totalToPay + "\n\tTotal tip: $" + totalTip
                        + "\n\tTotal per person: $" + totalPerPerson + "\n\tTip per person: $" + tipPerPerson;
                if (decision.equals("No")){
                    System.out.println("Your total amount to pay: $"+totalToPay+ "\n\tTotal tip: $" + totalTip);
                } else{
                    System.out.println(result);}
            }
        }