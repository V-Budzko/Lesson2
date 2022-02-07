package Lesson2;

public class Ninth_Task {
    public static void main(String[] args) {
        ninthTask(7, 8);
    }

    private static void ninthTask(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
    }
}
