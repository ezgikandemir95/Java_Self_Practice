package day13_practice_tasks.employee_task.employee_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Sarah", 30, "Femela", "1234", 60000, "Shinsage Group");
        Developer developer = new Developer("John", 28, "Male", "1236", 50000, "Hyundai", "Java");
        Teacher teacher = new Teacher("Jenny", 30, "female", "1237", 60000, "ABC academy");
        Driver driver = new Driver("Denis", 38, "Male", "1238", 60000, "Taxi coor.");

        tester.work();

        developer.work();

        teacher.work();

        driver.work();


    }
}
