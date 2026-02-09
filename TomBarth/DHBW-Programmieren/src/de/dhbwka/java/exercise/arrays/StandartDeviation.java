package de.dhbwka.java.exercise.arrays;

public class StandartDeviation {
    public static void main(String[] args) {
        double[] numbers = new double[100];
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random() * 10;
            sum += numbers[i];
        }

        double mittelwert = 1.0 / numbers.length * sum;

        double secondSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            secondSum += Math.pow(numbers[i] - mittelwert, 2);
        }

        double standartabweichung = Math.sqrt((1.0 / (100 - 1)) * secondSum);

        System.out.println(mittelwert);
        System.out.println(standartabweichung);
    }
}
