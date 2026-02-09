package de.dhbwka.java.exercise.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        /* old inefficient way
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Bitte die Anzahl der Elemente n eingeben:");
        String input;
        input = scan.next();
        int elements = Integer.parseInt(input);
        int[] numbers = new int[elements];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Zahl " + i + "eigeben: ");
            input = scan.next();
            numbers[i] = Integer.parseInt(input);
        }

        int secondcoutner = 0;
        for (int i = 0; i < numbers.length; i++){
            while (secondcoutner < numbers.length-1){
                if (numbers[secondcoutner] > numbers[secondcoutner+1]){
                    int save = numbers[secondcoutner];
                    numbers[secondcoutner] = numbers[secondcoutner+1];
                    numbers[secondcoutner+1] = save;
                }
                secondcoutner++;
                System.out.println(Arrays.toString(numbers));
            }
            secondcoutner = 0;
        }

        System.out.println(Arrays.toString(numbers));
        */

        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Bitte die Anzahl der Elemente n eingeben:");
        String input;
        input = scan.next();
        int elements = Integer.parseInt(input);
        int[] numbers = new int[elements];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Zahl " + i + "eigeben: ");
            input = scan.next();
            numbers[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < numbers.length - 1; i++){

            boolean didSwitch = false;
            for (int j = 0; j < numbers.length - i - 1; j++){
                if (numbers[j] > numbers[j+1]){
                    int saved = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = saved;
                    didSwitch = true;
                }
            }

            if (!didSwitch){
                break;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
