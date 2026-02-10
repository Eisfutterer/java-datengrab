package de.dhbwka.java.exercise.packages;

// k = 3
// * = 23
//   = 7
// m = 20
// n = 16
// i = 4
// j = 4
public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        j = ++i; // j = 1 i = 1

        int k = j++ + ++i; // k = j + (i + 1) = 3 -- j += 1
        System.out.println("k: " + k);
        System.out.println("*: " + j++ + ++i); // j = 2 i = 3 -- j += 1
        System.out.println(j++ + ++i); // 3 + (3 + 1) = 7 -- j += 1 | j = 4 | i = 4
        int m = j++ * ++i;
        System.out.println("m: " + m); // 4 * (1 + 4) = 20 -- j += 1 = 5
        int n = --j * --i;
        System.out.println("n: " + n); // -(5 - 1) * -(5 - 1) = 16
        System.out.println("i: " + i); // 4
        System.out.println("j: " + j); // 4
    }
}
