package de.dhbwka.java.exercise.control;

public class AddUp {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            java.util.Scanner scan = new java.util.Scanner(System.in);
            String input;
            System.out.println("Zahl eingeben(<0 Abbruch):");
            input = scan.next();
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Summme: " + sum);
                break;
            } else {
                sum += number;
            }
        }

        //second version with do
        sum = 0;
        do {
            java.util.Scanner scan = new java.util.Scanner(System.in);
            String input;
            System.out.println("Zahl eingeben(<0 Abbruch):");
            input = scan.next();
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Summme: " + sum);
                break;
            } else {
                sum += number;
            }
        } while (true);
    }
}
