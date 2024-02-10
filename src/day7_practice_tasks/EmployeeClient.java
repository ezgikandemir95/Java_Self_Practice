package day7_practice_tasks;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name ="Melody";
        employee1.age = 28;
        employee1.gender = 'F';
        employee1.jobTitle = "sdet";
        employee1.salary = 6_000 ;
        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age );
        System.out.println("Gender: " + employee1.gender);
        System.out.println("Job Title: " + employee1.jobTitle );
        System.out.println("Salary: " +employee1.salary+ "$" );
        employee1.work();

        Employee employee = new Employee();

    }

}
