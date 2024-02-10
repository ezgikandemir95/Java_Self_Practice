package day11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudent.schoolName= "Cydeo School";
        CydeoStudent.programmingLanguage = "Java";

        CydeoStudent student1 = new CydeoStudent("Lisa", 30, 23, 'A', 20, 1);
        CydeoStudent student2 = new CydeoStudent("Melody", 28, 10, 'A', 21, 2);

        student1.study();
        student2.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
        System.out.println(student1);
        System.out.println(student2);
    }

}

