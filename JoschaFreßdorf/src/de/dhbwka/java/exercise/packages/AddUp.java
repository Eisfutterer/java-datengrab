package de.dhbwka.java.exercise.packages;

import java.util.Scanner;

public class AddUp {
    void main() {
        addUp();
    }

    static void addUp() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int inp = 0;

        while (true) {
            System.out.print("Positive number: ");
            inp = sc.nextInt();
            if (inp > 0) {
                sum += inp;
            } else {
                break;
            }
        }
        System.out.println(sum);
        System.out.println("----------------");

        sum = 0;
        do {
            System.out.print("Positive number: ");
            inp = sc.nextInt();
            sum += inp > 0 ? inp : 0;
        } while (inp > 0);
        System.out.println(sum);
    }
}
