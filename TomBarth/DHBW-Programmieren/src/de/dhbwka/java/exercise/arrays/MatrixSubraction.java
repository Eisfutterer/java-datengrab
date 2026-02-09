package de.dhbwka.java.exercise.arrays;

public class MatrixSubraction {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input;
        System.out.println("Bitte Anzahl der Zeilen n eingeben:");
        input = scanner.next();
        int zeile = Integer.parseInt(input);
        System.out.println("Bitte Anzahl der Zeilen m eingeben:");
        input = scanner.next();
        int spalte = Integer.parseInt(input);

        int[][] matrix1 = new int[zeile][spalte];
        int[][] matrix2 = new int[zeile][spalte];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                int number = (int) (Math.random() * 100);
                matrix1[i][j] = number;
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                int number = (int) (Math.random() * 100);
                matrix2[i][j] = number;
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("|%6d", matrix1[i][j]);
            }
            System.out.println();
        }
    }
}
