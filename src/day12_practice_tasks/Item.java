package day12_practice_tasks;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.err.println("Name cannot be empty or blank.");
            System.exit(1);
        }
        if (!name.matches("^[a-zA-Z\\s]+$")) {
            System.err.println("Name must contain only letters and spaces.");
            System.exit(1);
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Unit price cannot be negative.");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Quantity cannot be negative.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double calcCost() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
    }

}
