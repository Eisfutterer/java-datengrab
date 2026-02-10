package de.dhbwka.java.exercise.packages;

public class MultiplicationTable {
    void main() {
        table();
    }

    static void table() {
        for (int x = 1; x <= 10; x++, System.out.println())
            for (int y = 0; y < 10; y++, System.out.printf("%5d", x * y))
                ;
    }
}
