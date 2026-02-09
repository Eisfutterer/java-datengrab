package de.dhbwka.java.exercise.arrays;

public class DotProduct {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Bitte die Anzahl der Elemente n eingeben:");
        String input;
        input = scan.next();
        int elements = Integer.parseInt(input);
        int[] vektor = new int[elements];
        int[] vektor2 = new int[elements];
        for (int i = 0; i < elements; i++) {
            System.out.println("Bitte x_" + i + " eingeben:");
            input = scan.next();
            vektor[i] = Integer.parseInt(input);
        }
        for (int i = 0; i < elements; i++) {
            System.out.println("Bitte y_" + i + " eingeben:");
            input = scan.next();
            vektor2[i] = Integer.parseInt(input);
        }

        double skalarprodukt = 0;
        for (int i = 0; i < elements; i++) {
            skalarprodukt += vektor[i] * vektor2[i];
        }
        System.out.println("Das Skalarprodukt von x und y ist " + skalarprodukt);
    }
}
