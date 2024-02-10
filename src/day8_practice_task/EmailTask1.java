package day8_practice_task;

import java.util.Scanner;

public class EmailTask1 {

            public static void main(String[] args) {
                Scanner str = new Scanner(System.in);

                System.out.println("Enter your E-Mail :");
                String emailAddress = str.next();

                eMailFix(emailAddress);

                str.close();

            }
            public static void eMailFix(String emailAddress) {
                int underscore = emailAddress.indexOf('_');
                int atSymbol = emailAddress.indexOf('@');


                if (underscore != -1) {
                    String firstName = emailAddress.substring(0, underscore);
                    String lastName = emailAddress.substring(underscore + 1, atSymbol);
                    String domain = emailAddress.substring(atSymbol);
                    String newemail = firstName.replace(firstName, lastName) + "_" + firstName + domain;


                    System.out.println(newemail);

                } else {
                    System.out.println(emailAddress);
                }


            }           }