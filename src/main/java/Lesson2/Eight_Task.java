package Lesson2;

public class Eight_Task {
    public static void main(String[] args) {
        fillDiagonal();
    }

    private static void fillDiagonal() {
        int a= 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = a;
                a++;
                if (i == j) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }


            System.out.println();
        }

    }
}