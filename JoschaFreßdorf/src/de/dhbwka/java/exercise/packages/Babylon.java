package de.dhbwka.java.exercise.packages;

import java.util.Scanner;

public class Babylon {
    void main() {
        babylon();
    }

    static void babylon() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name = sc.next();
        int xn = 1;

        xn = (xn + (num / xn) / 2);
    }
}