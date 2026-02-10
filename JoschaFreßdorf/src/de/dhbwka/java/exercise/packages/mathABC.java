package de.dhbwka.java.exercise.packages;

import java.util.Scanner;

public class mathABC {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        abc(a, b, c);
    }

    static void abc(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.println(d);
        if (a == 0) {
            if (b == 0) {
                System.out.println("Gleichung degeneriert");
                return;
            }
            double x = -(c / b);
            System.out.println("Solution is: " + x);
            return;
        } else if (d < 0) {
            System.out.println("Konjugiert komplex");
            return;
        } else {
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Solutions are: " + x1 + " and " + x2);
        }
    }
}
