//FA
//زمان فعلی سیستم را یک بار می‌خواند و به شکل ساعت:دقیقه:ثانیه چاپ می‌کند، مثلاً  3:7:9.
//EN
//It reads the current system time once and prints it as hour:minute:second, e.g. Now Time 3:7:9.

package Projects;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Now Time  " + LocalTime.now().format(formatter));
    }
}