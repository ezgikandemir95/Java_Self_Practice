package day7_practice_tasks;

public class Address {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zipCode;

    @Override
    public String toString() {

        return "Adress{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

