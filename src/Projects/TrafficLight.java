//FA
//یک چراغ راهنمای ساده را شبیه‌سازی می‌کند. با هر ثانیه یک بار اجرا می‌شود، شمارنده را چاپ
//می‌کند و در زمان‌های مشخص رنگ چراغ را اعلام می‌کند: سبز از ثانیه‌ی ۰، زرد از ثانیه‌ی ۹ و قرمز از ثانیه‌ی ۱۴ شروع می‌شود.
//EN
//It simulates a simple traffic light. A Timer runs run() every second, prints a counter, and announces
//the light color at set moments: green from second 0, yellow from 9, red from 14.

package Projects;

public class TrafficLight {

	private enum Light {
		GREEN("Green", 9),
		YELLOW("Yellow", 5),
		RED("Red", 6);

		private final String label;
		private final int seconds;

		Light(String label, int seconds) {
			this.label = label;
			this.seconds = seconds;
		}
	}

	private static final int CYCLES = 2;

	public static void main(String[] args) throws InterruptedException {
		int time = 0;

		for (int cycle = 0; cycle < CYCLES; cycle++) {
			for (Light light : Light.values()) {
				System.out.println(" " + light.label + " ");
				for (int i = 0; i < light.seconds; i++) {
					System.out.println("Time: " + time++);
					Thread.sleep(1000);
				}
			}
		}
	}
}