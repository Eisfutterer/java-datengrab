package de.dhbwka.java.exercise.operators;

public class Easter {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String input;
        System.out.println("Enter year:");
        input = scan.next();
        int jahr = Integer.parseInt(input);

        int a = jahr % 19;
        int b = jahr % 4;
        int c = jahr % 7;
        int k = jahr / 100;
        int p = (8 * k + 13) / 25;
        int q = k / 4;
        int m = (15 + k - p - q) % 30;
        int n = (4 + k - q) % 7;
        int d = (19 * a + m) % 30;
        int e = (2 * b + 4 * c + 6 * d + n) % 7;
        int ostern = (22 + d + e);
        System.out.printf("Ostern ist %d Tage nach dem ersten März \n", ostern);

        System.out.println("To get date enter code.");

        input = scan.next();
        int code = Integer.parseInt(input);
        if (code == 111111) {
            if (ostern > 30) {
                ostern -= 31;
                System.out.printf("Ostern ist am %d. April", ostern);
            } else {
                System.out.printf("Ostern ist am %d. März", ostern);
            }
        }
    }
}
