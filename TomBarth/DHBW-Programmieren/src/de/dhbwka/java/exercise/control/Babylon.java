package de.dhbwka.java.exercise.control;

public class Babylon {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String inputstring;
        System.out.println("Enter your number:");
        inputstring = scan.next();
        double number = Double.parseDouble(inputstring);
        double xn, xn1;
        // first run
        xn = 1.0;
        xn1 = (xn + (number / xn)) / 2;
        System.out.println(xn);

        while (Math.abs(xn1 - xn) > 0.000001) {
            xn = xn1;
            xn1 = (xn + (number / xn)) / 2;
            System.out.println(xn);
        }
    }
}
