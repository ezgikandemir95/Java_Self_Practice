package day9_practice_tasks;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {

        String [] items = {"Shoes","Jacket","Gloves","Airpods","Ipad",
        "Iphone 12 case"};
        double [] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345,12346,12347,123459,12350};


         Arrays.sort(items);
        System.out.println(Arrays.binarySearch(items, "Gloves"));

        String hasItem = "iPad";
        for (String item : items) {
            if (item.equalsIgnoreCase(hasItem))
                System.out.println(hasItem + " is contained in the item list.");

        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - " + itemIDs[i]);
        }


    }
}



