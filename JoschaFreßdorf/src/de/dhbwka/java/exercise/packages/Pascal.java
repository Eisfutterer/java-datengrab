package de.dhbwka.java.exercise.packages;

public class Pascal {
    void main() {
        pascal();
    }

    static void pascal() {
        int length = 24;
        int[][] pascal = new int[length][length];
        pascal[0][0] = 1;

        for (int i = 1; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {

                if (j - 1 < 0) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }
        for (int x = 0; x < pascal.length; x++) {
            for (int l = 0; l < length - x; l++) {
                System.out.print("   ");
            }
            for (int y = 0; y < pascal[x].length; y++) {
                if (pascal[x][y] == 0) {
                    System.out.print("");
                } else {
                    System.out.printf("%6d", pascal[x][y]);
                }
            }
            System.out.println();
        }
    }
}
