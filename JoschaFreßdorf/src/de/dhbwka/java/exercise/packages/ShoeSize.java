package de.dhbwka.java.exercise.packages;

public class ShoeSize {
    void main() {
        shoeSize();
    }

    static void shoeSize() {
        System.out.printf("%13s | %3s%n", "centimeters", "size");
        System.err.println("--------------+-----");
        for (int i = 30; i < 50; i++) {
            System.out.printf("%5.2f - %5.2f | %3d%n", ((i - 1) / 1.5), (i / 1.5), i);
        }
    }
}
