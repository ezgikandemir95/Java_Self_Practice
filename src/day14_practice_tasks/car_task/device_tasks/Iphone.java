package day14_practice_tasks.car_task.device_tasks;

public final class Iphone extends Phone implements AppleApps{

    public Iphone( String model, String color, String size, double price) {
        super("Apple", model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}
