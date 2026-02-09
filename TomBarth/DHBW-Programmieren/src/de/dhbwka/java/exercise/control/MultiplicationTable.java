package de.dhbwka.java.exercise.control;

public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int number = j * i;
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }
}
