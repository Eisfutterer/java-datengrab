package de.dhbwka.java.exercise.packages;

import java.util.Arrays;

public class StandardDeviation {
    void main() {
        int size = 20;
        int[] list = new int[size];
        fill(list);
        middle(list, size);
    }

    static void fill(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array is: " + Arrays.toString(list));
    }

    static void middle(int[] list, int lenght) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        int middle = sum / list.length;
        System.out.println("Middle is: " + middle);

        int distances = 0;
        for (int i : list) {
            distances += Math.pow(i - middle, 2);
        }

        double deviation = Math.sqrt(distances / (list.length - 1));
        System.out.println("Deviation is: " + deviation);
    }
}
