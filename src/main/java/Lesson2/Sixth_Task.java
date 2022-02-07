package Lesson2;

public class Sixth_Task {
    public static void main(String[] args) {
    fillArray();
    }

    private static void fillArray() {
        int[] arr = new int[100];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a += 1;
            System.out.println(arr[i]);
        }
    }
}
