package Lesson2;

public class First_Task {
    public static void main(String[] args) {
        firstTask(-5, 17);
    }

    public static boolean firstTask(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
