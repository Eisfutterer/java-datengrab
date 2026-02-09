package de.dhbwka.java.exercise.control;

public class LeapYear {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String input;
        System.out.println("Enter year:");
        input = scan.next();

        int year = Integer.parseInt(input);

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("No leap year.");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("No leap year.");
        }
    }
}
