package de.dhbwka.java.exercise.packages;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSubtraction {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of lines: ");
        int lines = sc.nextInt();
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        matrixSubtraction(lines, rows);
        sc.close();
    }

    static void matrixSubtraction(int lines, int rows) {
        int[][] m = new int[lines][rows];
        int[][] n = new int[lines][rows];
        int[][] result = new int[lines][rows];

        System.out.println("Matrix 1:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 100);
            }
            for (int value : m[i]) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matrix 2:");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = (int) (Math.random() * 100);
            }
            for (int value : n[i]) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Result (Matrix 1 - Matrix 2):");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = m[i][j] - n[i][j];
            }
            for (int value : result[i]) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
