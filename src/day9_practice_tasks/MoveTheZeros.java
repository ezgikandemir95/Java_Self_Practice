package day9_practice_tasks;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);
        int length = array.length;
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }


    }
}