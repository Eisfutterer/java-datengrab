package de.dhbwka.java.exercise.packages;

import java.util.Scanner;

public class Norm {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set your n: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Set x_" + i + ": ");
            array[i] = sc.nextInt();
        }

        int prod = 0;
        for (int i : array) {
            prod += Math.pow(i, 2);
        }
        double result = Math.sqrt(prod);
        System.out.println("Vector length is: " + result);
        sc.close();
    }
}
