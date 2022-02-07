package Lesson2;

public class Fifth_Task {
    public static void main(String[] args) {
     invertArray();
        }

    private static void invertArray() {
        int[] arr = new int[]{1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);


        }


    }
}