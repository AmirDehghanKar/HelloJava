//FA
//یک آرایه‌ی عددی {5, 2, 8, 1, 9} می‌سازد و سه کار روی آن انجام می‌دهد: ۱) مجموع عناصر را حساب می‌کند،
//آرایه را صعودی مرتب می‌کند، ۳) با جستجوی دودویی عدد 8 را پیدا می‌کند و جایگاهش را چاپ می‌کند
//EN
//It creates an int array {5, 2, 8, 1, 9} and does three things: sums the elements, sorts the array in
//ascending order, then uses binarySearch to look for 8 and prints its index.

package Projects;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 1, 9 };
		int target = 8;

		int sum = Arrays.stream(numbers).sum();
		System.out.println("Sum: " + sum);

		Arrays.sort(numbers);
		System.out.println("Sorted: " + Arrays.toString(numbers));

		int index = Arrays.binarySearch(numbers, target);
		if (index >= 0) {
			System.out.println("Number " + target + " found at index " + index + ".");
		} else {
			System.out.println("Number " + target + " not found.");
		}
	}
}