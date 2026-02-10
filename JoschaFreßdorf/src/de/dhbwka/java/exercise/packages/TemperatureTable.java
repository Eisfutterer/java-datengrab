package de.dhbwka.java.exercise.packages;

public class TemperatureTable {
    void main() {
        fToc();
    }

    static void fToc() {
        System.out.printf("%7s | %9s%n", "°F", "°C");
        System.out.println("--------+----------");
        for (int i = 0; i <= 300; i++) {
            if (i % 20 != 0)
                continue;
            double c = (5.0 / 9.0) * (i - 32);
            System.out.printf("%5d°F | %7.2f°C%n", i, c);
        }
    }
}
