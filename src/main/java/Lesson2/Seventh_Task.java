package Lesson2;

import java.util.Arrays;

public class Seventh_Task {
    public static void main(String[] args) {
        changeArray();
    }

    private static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            System.out.println(arr[i]);
        }



    }
}

