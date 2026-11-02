//FA
//اطلاعات سه سگ (نام، رنگ، نژاد، سن) را از کاربر می‌گیرد و چاپ می‌کند. برای هر سگ یک کار متفاوت انجام می‌دهد:
//سگ اول می‌خوابد، دومی غذا می‌خورد و سومی پارس می‌کند. اگر سن بیشتر از ۲۰ باشد پیر و در غیر این صورت جوان چاپ می‌شود.
//EN
//It reads the details (name, color, breed, age) of three dogs and prints them. Each dog performs a
//different action: the first sleeps, the second eats, the third barks. If the age is over 20 it prints Old, otherwise Yang.

package Projects;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Dog {

	private static final String ANIMAL = "Dog";
	private static final int OLD_AGE = 10;
	private static final int DOG_COUNT = 3;

	private final String name;
	private final String color;
	private final String breed;
	private final int age;

	public Dog(String name, String color, String breed, int age) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
	}

	public void bark() {
		System.out.println("----Woof... Woof");
	}

	public void sleep() {
		System.out.println("----The dog is sleeping");
	}

	public void eat() {
		System.out.println("----The dog is eating");
	}

	public void printInfo() {
		System.out.println();
		System.out.println("Name:  " + name);
		System.out.println("Color: " + color);
		System.out.println("Breed: " + breed);
		System.out.println("Age:   " + age);
		System.out.println(age > OLD_AGE ? "Old" : "Young");
	}

	private static String readLine(Scanner scanner, String prompt) {
		String value;
		do {
			System.out.print(prompt);
			value = scanner.nextLine().trim();
		} while (value.isEmpty());
		return value;
	}

	private static int readAge(Scanner scanner) {
		while (true) {
			System.out.print("Age: ");
			String text = scanner.nextLine().trim();
			try {
				int age = Integer.parseInt(text);
				if (age >= 0) {
					return age;
				}
			} catch (NumberFormatException e) {
				// fall through to the message below
			}
			System.out.println("Please enter a valid age.");
		}
	}

	public static void main(String[] args) {
		List<Consumer<Dog>> actions = List.of(Dog::sleep, Dog::eat, Dog::bark);

		try (Scanner scanner = new Scanner(System.in)) {
			for (int i = 0; i < DOG_COUNT; i++) {
				System.out.println("\nAnimal: " + ANIMAL + " #" + (i + 1));

				String name = readLine(scanner, "Name: ");
				String color = readLine(scanner, "Color: ");
				String breed = readLine(scanner, "Breed: ");
				int age = readAge(scanner);

				Dog dog = new Dog(name, color, breed, age);
				dog.printInfo();
				actions.get(i).accept(dog);
			}
		}
	}
}