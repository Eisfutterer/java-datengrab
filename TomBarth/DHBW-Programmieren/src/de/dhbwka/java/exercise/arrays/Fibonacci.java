package de.dhbwka.java.exercise.arrays;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int goal = 20;
        if (goal == 1) {
            System.out.println("1");
            return;
        }
        if (goal == 0) {
            System.out.println("0");
            return;
        }
        if (goal < 0) {
            System.out.println("Ungültige Zahl.");
            return;
        }
        int[] numbers = new int[goal];
        numbers[0] = 0;
        numbers[1] = 1;

        for (int i = 2; i < goal; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[goal - 1]);
    }
}
