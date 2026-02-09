package de.dhbwka.java.exercise.arrays;

public class Pascal {
    public static void main(String[] args) {
        int row = 9;
        if (row > 16) {
            System.out.println("Die Zahl wird nicht akzeptiert. Grund:");
            return;
        }
        int[][] pas = new int[row][];
        pas[0] = new int[] { 1 };
        pas[1] = new int[] { 1, 1 };
        for (int i = 2; i < pas.length; i++) {
            pas[i] = new int[i + 1];

            for (int j = 0; j < pas[i].length; j++) {
                if (j == 0 | j == pas[i].length - 1) {
                    pas[i][j] = 1;
                } else {
                    pas[i][j] = pas[i - 1][j - 1] + pas[i - 1][j];
                }
            }
        }
        for (int i = 0; i < pas.length; i++) {
            for (int k = 0; k < pas[(pas.length - i - 1)].length; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < pas[i].length; j++) {
                System.out.printf("%4d", pas[i][j]);
            }
            System.out.println();
        }
    }
}
