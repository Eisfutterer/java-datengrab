package de.dhbwka.java.exercise.packages;

import java.util.Scanner;

public class DotProduct {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set your n: ");
        int n = sc.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Set x_" + i + ": ");
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Set y_" + i + ": ");
            array2[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            result += array1[i] * array2[i];
        }

        System.out.println("The dot product is: " + result);
        sc.close();
    }
}
