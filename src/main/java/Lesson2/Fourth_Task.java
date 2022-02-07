package Lesson2;

public class Fourth_Task {
    public static void main(String[] args) {
        fourthTask("WasUp", 5);
        fourthHardTask(2016);
        System.out.println(fourthHardTask(2016));
    }

    private static boolean fourthHardTask( int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else return false;
    }

    private static void fourthTask(String STR, int i) {
        for(int x=0; x< i; x++){
            System.out.println(STR);
        }
    }
}
