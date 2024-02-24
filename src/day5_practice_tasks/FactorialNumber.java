package day5_practice_tasks;

public class FactorialNumber {
    public static void main(String[] args) {

        int num = 5;
        long result=1;

        for (int i = num; i >= 1; i--) {
            result *= i;

        }
        System.out.print("result = " + result);
    }
}
