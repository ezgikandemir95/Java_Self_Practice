package day9_practice_tasks;

public class ArrayElements {
    public static void main(String[] args) {

        int[] numbers ;
        numbers=new int[100];
        int lengthOfArray= numbers.length;
        System.out.println("lengthOfArray: " + lengthOfArray);
        for (int i = 0; i < 100; i++) {
            numbers [i]=i+1;
            System.out.print(numbers[i]+ " ");

        }
        System.out.println();
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }

    }
}



