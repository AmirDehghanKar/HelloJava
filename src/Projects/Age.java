//FA
//سن سه کاربر را یکی‌یکی از ورودی می‌گیرد و بیشترین و کمترین سن را چاپ می‌کند.
//EN
//It reads the ages of three users and prints the maximum and minimum age.

package Projects;

import java.util.Scanner;

public class Age {

	private static final int USER_COUNT = 3;
	private static final int MIN_VALID = 0;
	private static final int MAX_VALID = 120;

	private static int readAge(Scanner scanner, int userNumber) {
		while (true) {
			System.out.print("Enter age of user " + userNumber + ": ");
			if (scanner.hasNextInt()) {
				int age = scanner.nextInt();
				if (age >= MIN_VALID && age <= MAX_VALID) {
					return age;
				}
			} else {
				scanner.next(); // discard invalid input
			}
			System.out.println("Please enter a valid age (" + MIN_VALID + "-" + MAX_VALID + ").");
		}
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int minAge = Integer.MAX_VALUE;
			int maxAge = Integer.MIN_VALUE;

			for (int i = 1; i <= USER_COUNT; i++) {
				int age = readAge(scanner, i);
				minAge = Math.min(minAge, age);
				maxAge = Math.max(maxAge, age);
			}

			System.out.println("--- Maximum age: " + maxAge);
			System.out.println("--- Minimum age: " + minAge);
		}
	}
}