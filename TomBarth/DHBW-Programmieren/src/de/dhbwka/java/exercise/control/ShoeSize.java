package de.dhbwka.java.exercise.control;

public class ShoeSize {
        public static void main(String[] args) {
            for (double zentimeter = 1933; zentimeter < 3200;){
            double updatetzentimeter = zentimeter + (2.0 / 3.0) * 100.0;
            double size = (updatetzentimeter * 1.5 / 100.0);
            System.out.printf("%4.2f" + "-" + "%4.2f" + "|" + Math.round(size) + "\n", (float)(zentimeter / 100.0), (float)(updatetzentimeter / 100.0));
            zentimeter = updatetzentimeter;
        }
    }
}
