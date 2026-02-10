package de.dhbwka.java.exercise.packages;

import java.util.Arrays;

public class Fibonacci {
    void main() {
        int[] numbers = new int[20];
        numbers[0] = 0;
        numbers[1] = 1;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }

        System.out.println("Fibonacci list: " + Arrays.toString(numbers));
    }

}
