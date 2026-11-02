//FA
//شعاع یک دایره را از کاربر می‌گیرد و مساحت دایره را با فرمول شعاع × شعاع × π حساب و چاپ می‌کند.
//EN
//It reads a circle’s radius and prints the area using radius × radius × π. For radius 5 it prints 78.5.

package Projects;

import java.util.Locale;
import java.util.Scanner;

public class Circle {

    private static double readRadius(Scanner scanner) {
        while (true) {
            System.out.print("Enter the circle radius: ");
            if (scanner.hasNextDouble()) {
                double radius = scanner.nextDouble();
                if (radius > 0) {
                    return radius;
                }
            } else {
                scanner.next();
            }
            System.out.println("Please enter a positive number.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US);

            double radius = readRadius(scanner);
            double area = Math.PI * radius * radius;

            System.out.printf(Locale.US, "Area = PI * r * r = %.2f%n", area);
        }
    }
}