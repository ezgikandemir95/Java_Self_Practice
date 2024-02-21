package day14_practice_tasks.car_task.device_tasks;

public final class Google extends Phone implements AndroidApps{

        public Google( String model, String color, String size, double price) {
            super("Google", model, color, size, price);
        }

        @Override
        public void downloadApp() {
            System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
        }

    }
