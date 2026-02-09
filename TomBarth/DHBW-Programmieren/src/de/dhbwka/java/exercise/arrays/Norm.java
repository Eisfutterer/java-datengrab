package de.dhbwka.java.exercise.arrays;

public class Norm {
    public static void main(String[] args) { //einfacher wäre immer direkt die Summe zu berechnen und dann nur die Wurzel ziehen am Ende
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Bitte die Anzahl der Elemente n eingeben:");
        String input;
        input = scan.next();
        int elements = Integer.parseInt(input);
        int[] vektor = new int[elements];
        for (int i = 0; i < elements; i++) {
            System.out.println("Bitte x_" + i + " eingeben:");
            input = scan.next();
            vektor[i] = Integer.parseInt(input);
        }
        double sum = 0;
        for (int i = 0; i < elements; i++) {
            sum += Math.pow(vektor[i], 2);
        }
        double betrag = Math.sqrt(sum);
        System.out.println(betrag);
    }
}
