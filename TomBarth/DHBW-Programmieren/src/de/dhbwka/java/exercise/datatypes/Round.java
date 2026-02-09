package de.dhbwka.java.exercise.datatypes;

public class Round {
    public static void main(String[] args) {
        double pi = 3.1315926;
        double e = 2.7182818;

        int piInt = (int) (pi + 0.5F);
        int eInt = (int) (e + 0.5F);

        System.out.println(piInt);
        System.out.println(eInt);

        //improved rounding
        double pinegativ = -3.1315926;
        double enegativ = -2.7182818;

        System.out.println(dorounding(pi));
        System.out.println(dorounding(e));
        System.out.println(dorounding(pinegativ));
        System.out.println(dorounding(enegativ));
    }

    private static int dorounding(double number){
        if (number > 0){
            return (int) (number + 0.5F);
        }
        else {
            return (int) (number - 0.5F);
        }
    }
}
