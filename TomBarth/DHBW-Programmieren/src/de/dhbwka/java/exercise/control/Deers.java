package de.dhbwka.java.exercise.control;

public class Deers {
    public static void main(String[] args) {
        int counter = 0;
        int bestand = 205;
        System.out.println("Startbestand:" + bestand);
        for (; bestand < 301;) {
            counter++;
            bestand = bestand + (int) (bestand * 0.1);
            bestand -= 15;
            System.out.println(counter + ":" + bestand);
        }
    }
}
