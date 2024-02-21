package day14_practice_tasks.car_task;

public class Honda extends Car{
        public Honda(String model, String color, int year, double price) {
            super("Honda", model, year, price, color);
        }

        @Override
        public void drive() {
            System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
        }

        @Override
        public void start() {
            System.out.println("Twist the key to ignition to start "+getMake()+" "+getModel());
        }

    }
