package day5_practice_tasks;

public class Alphabet {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            System.out.print("\t\t\t");
            for (char j = 'a'; j <='z' ; j++) {
                System.out.print(i+"" + j + " ");
            }
            System.out.println();
        }
    }
}
