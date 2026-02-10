package de.dhbwka.java.exercise.packages;

public class LeapYear {
    void main() {
        isLeapYear(2000);
        isLeapYear(2018);
        isLeapYear(2020);
        isLeapYear(2100);
    }

    static void isLeapYear(int year) {
        // System.out.print(year);
        // System.out.println(
        // (year % 4 == 0) ? (year % 100 == 0) ? (year % 400 == 0) ? " is a leap year" :
        // " is no leap year"
        // : " is a leap year" : " is no leap year");

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.err.println(year + " is a leap year");
                } else {
                    System.err.println(year + " is no leap year");
                }
            } else {
                System.err.println(year + " is a leap year");
            }
        } else {
            System.err.println(year + " is no leap year");
        }
    }
}
