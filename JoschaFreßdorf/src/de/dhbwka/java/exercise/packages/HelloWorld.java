package de.dhbwka.java.exercise.packages;

public class HelloWorld {
	void main() {
		double pi = 3.14;
		double pi2 = 3.54;
		double e = -2.49;
		double mid = -2.5;
		// print(Round.round(pi));
		// print(Round.round(pi2));
		print(Round.round(e));
		print(Round.roundzwei(e));
		print(Round.round(mid));
		print(Round.roundzwei(mid));
	}

	static <T> void print(T... x) {
		for (T item : x) {
			System.out.print(item);
		}
		System.out.println();
	}
}
