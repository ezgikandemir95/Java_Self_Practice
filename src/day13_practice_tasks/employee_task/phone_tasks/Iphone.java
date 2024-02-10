package day13_practice_tasks.employee_task.phone_tasks;

public class Iphone extends Phone {

        public Iphone(String model, String size, double price, String color) {
            super("Iphone", model, size, price, color);
        }

        public void faceTime(String phoneNumber) {
            System.out.println("Facetiming with the number " + phoneNumber);
        }

    }
