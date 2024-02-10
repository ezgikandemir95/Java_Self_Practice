package day7_practice_tasks;

public class AddressClient {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.buildingNumber=1509;
        address1.street="Jeonpo Daero";
        address1.city="Busan";
        address1.state="KR";
        address1.zipCode= "34100";

        System.out.println(address1.buildingNumber + address1.street+ "\n"+address1.city+ ","+address1.state+" "+address1.zipCode);

    }

}
