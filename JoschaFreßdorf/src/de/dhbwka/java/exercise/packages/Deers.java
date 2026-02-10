package de.dhbwka.java.exercise.packages;

public class Deers {
    void main() {
        population();
    }

    static void population() {
        int deers = 200;

        for (int i = 1; deers < 300; i++) {
            deers = (int) (deers * 1.1 - 15);
            System.out.println(i + ": " + deers + " Deers alive");
        }
    }
}
