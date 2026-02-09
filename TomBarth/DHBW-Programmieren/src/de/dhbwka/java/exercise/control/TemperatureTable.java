package de.dhbwka.java.exercise.control;

public class TemperatureTable {
    public static void main(String[] args) {
        System.out.println("Fahrenheit |  Celsius");
        System.out.println("-----------+---------");
        for (int i = 0; i < 320; i += 20) {
            double c = (5.0 / 9.0) * (i - 32);

            System.out.printf("|%10.2f|%9.2f|\n", (float) i, c);
        }
    }
}
