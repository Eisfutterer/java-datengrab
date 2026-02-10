package de.dhbwka.java.exercise.packages;

public class Round {
    static int round(double x) {
        return x > 0 ? x - (int) x < 0.5 ? (int) x : (int) x + 1 : x - (int) x > -0.5 ? (int) x : (int) x - 1;
    }

    static int roundzwei(double x) {
        // if (x < 0) {
        // return (int) (x - 0.5);
        // } else {
        // return (int) (x + 0.5);
        // }
        return (x < 0) ? (int) (x - 0.5) : (int) (x + 0.5);
    }

    static void rand(int x) {
        System.out.println(x++);
        System.out.println(++x);
    }
}
