package day6_practice_tasks;

public class OddOrEven {
    public static void main(String[] args) {
        // boolean result = isOdd(100);
        // System.out.println(result);
        boolean result = isEven(100);
        System.out.println(result);


    }
    public static boolean isOdd(int number){
        if (number%2 !=0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isEven(int number){
        return !isOdd(number);
    }
}
