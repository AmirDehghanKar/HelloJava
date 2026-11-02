//FA
//یک ماشین لباسشویی ساده را شبیه‌سازی می‌کند. سطح آب را می‌گیرد (باید بین ۳۰ تا ۷۰ باشد، تا چهار بار فرصت
//دارد)، می‌پرسد «ماشین روشن شود؟» و بعد یک شمارش معکوس ۶۰ ثانیه‌ای با شروع می‌شود. در زمان‌های مشخص
//مرحله‌ها اعلام می‌شوند: مخلوط آب و پودر، پر شدن مخزن، شستشو، شستشوی سریع، تخلیه و آبکشی. در پایان چاپ می‌شود.
//EN
//It simulates a simple washing machine. It reads the water level (must be 30-70, up to four attempts),
//asks whether to turn the machine on, then runs a 60-second countdown with a Timer. At set moments
//it announces the stages: mixing water and powder, filling the tank, washing, quick wash, draining, rinsing. It prints End when done.

package Projects;

import java.util.Map;
import java.util.Scanner;

public class washing_machine {

	private static final int MIN_LEVEL = 30;
	private static final int MAX_LEVEL = 70;
	private static final int TOTAL_SECONDS = 60;

	// remaining seconds -> stage message
	private static final Map<Integer, String> STAGES = Map.of(
			57, "Mix water and washing powder",
			50, "Fill the tank with powder and water",
			45, "Start washing",
			35, "Quick wash",
			15, "Drain the water",
			10, "Rinse");

	private static int readWaterLevel(Scanner scanner) {
		while (true) {
			System.out.print("Water level (" + MIN_LEVEL + "-" + MAX_LEVEL + "): ");
			try {
				int level = Integer.parseInt(scanner.nextLine().trim());
				if (level >= MIN_LEVEL && level <= MAX_LEVEL) {
					return level;
				}
			} catch (NumberFormatException e) {
				// fall through to the error message below
			}
			System.out.println("Error: enter a number between " + MIN_LEVEL + " and " + MAX_LEVEL + ".");
		}
	}

	private static boolean confirmStart(Scanner scanner) {
		System.out.print("Turn on the washing machine? (y/n): ");
		String answer = scanner.nextLine().trim().toLowerCase();
		return answer.equals("y") || answer.equals("yes");
	}

	public static void main(String[] args) throws InterruptedException {
		try (Scanner scanner = new Scanner(System.in)) {
			int level = readWaterLevel(scanner);
			System.out.println("Water level set to " + level);

			if (!confirmStart(scanner)) {
				System.out.println("Cancelled.");
				return;
			}
		}

		for (int remaining = TOTAL_SECONDS; remaining > 0; remaining--) {
			String stage = STAGES.get(remaining);
			if (stage != null) {
				System.out.println("  " + stage + "  ");
			}
			System.out.println("Timer: " + remaining);
			Thread.sleep(1000);
		}
		System.out.println("End");
	}
}