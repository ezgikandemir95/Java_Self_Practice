package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Melody", 28, 'F', "Developer", 12000.0);
        Employee emp2 = new Employee("Kat", 30, 'F', "Teacher", 70000.0);

        emp1.work();
        emp2.work();

        System.out.println(emp1);
        System.out.println(emp2);
    }

}
