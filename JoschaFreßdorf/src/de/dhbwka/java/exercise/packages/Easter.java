package de.dhbwka.java.exercise.packages;

import java.util.Scanner;

public class Easter {
    void main() {
        System.out.print("Calculate Easter date for year: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toString();
        int year = Integer.parseInt(input);
        int a, b, c, d, e, k, p, q, m, n;

        a = year % 19;
        b = year % 4;
        c = year % 7;
        k = year / 100;
        p = (8 * k + 13) / 25;
        q = k / 4;
        m = (15 + k - p - q) % 30;
        n = (4 + k - q) % 7;
        d = (19 * a + m) % 30;
        e = (2 * b + 4 * c + 6 * d + n) % 7;
        int easter = (22 + d + e);
        String month = easter > 31 ? "April" : "March";
        easter = easter > 31 ? easter - 31 : easter;
        System.out.println("Easter " + year + " is on: " + easter + ". " + month);
    }
}
