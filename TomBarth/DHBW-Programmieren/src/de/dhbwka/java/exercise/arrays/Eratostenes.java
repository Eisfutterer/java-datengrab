package de.dhbwka.java.exercise.arrays;

import java.util.Arrays;

public class Eratostenes {
        public static void main(String[] args) {
            System.out.println("Gebe die Zahl bis wohin die Primzahlen überprüft werden sollen(größer 2): ");
        java.util.Scanner scaner = new java.util.Scanner(System.in);
        String input;
        input = scaner.next();
        int border = Integer.parseInt(input);
        int[] sieve = new int[border-1];
        int[] primes = new int[border-1];
        int primecounter = 0;

        for (int i = 2; i < border + 1; i++){
            sieve[i-2] = i;
        }

        for (int i = 0; i < sieve.length; i++){
            if (sieve[i] != 0){
                primes[primecounter] = sieve[i];
                primecounter++;
                //System.out.println(Arrays.toString(sieve));
                for (int j = i+1; j < sieve.length; j++){

                    int rest = sieve[j] % sieve[i];
                    if (rest == 0) {
                        sieve[j] = 0;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(primes));
    }
}
