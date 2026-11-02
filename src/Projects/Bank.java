//FA
//یک ماشین‌حساب ساده‌ی وام بانکی است. مبلغ وام، درصد سود و مدت را می‌گیرد، سود وام را با فرمول
//درصد × (۱۲+۱) ÷ ۲۴۰۰ حساب می‌کند (ظاهراً فرمول رایج سود ساده‌ی اقساطی بانک‌ها) و مبلغ وام، سود و قسط ماهانه را چاپ می‌کند.
//EN
//A simple bank loan calculator. It reads the loan amount, interest rate, and duration, computes the profit
//with amount × rate × (12+1) ÷ 2400 (apparently the common simple-interest installment formula),
//and prints the loan, the profit, and the monthly payment.

package Projects;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

    private static double readPositive(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value > 0) {
                    return value;
                }
            } else {
                scanner.next(); // discard invalid input
            }
            System.out.println("Please enter a positive number.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double loan = readPositive(scanner, "Loan amount: ");
            double rate = readPositive(scanner, "Annual interest rate (%): ");
            double years = readPositive(scanner, "Number of years: ");

            int months = Math.max(1, (int) Math.round(years * 12));
            double profit = loan * rate * (months + 1) / 2400.0;
            double monthlyPayment = (loan + profit) / months;

            System.out.printf(Locale.GERMANY, "Loan amount:     %,.0f%n", loan);
            System.out.printf(Locale.GERMANY, "Total profit:    %,.0f%n", profit);
            System.out.printf(Locale.GERMANY, "Monthly payment: %,.0f%n", monthlyPayment);
        }
    }
}