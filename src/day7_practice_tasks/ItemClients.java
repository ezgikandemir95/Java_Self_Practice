package day7_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {
        Item item1 = new Item();

        item1.itemName = "Laptop";
        item1.unitPrice = 1200;
        item1.quantity = 100;

        item1.calcCost();
        System.out.println(item1);

        Item itemName2 = new Item();
        itemName2.itemName = "Iphone";
        itemName2.unitPrice = 50;
        itemName2.quantity=100;

        itemName2.calcCost();
        System.out.println(itemName2);


    }
}
