import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            var currentTime = br.readLine();
            var targetTime = br.readLine();

            if (currentTime.equals(targetTime)) {
                System.out.println("24:00:00");
                return;
            }

            var formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            var currentLocalTime = LocalTime.parse(currentTime, formatter);
            var targetLocalTime = LocalTime.parse(targetTime, formatter);
            var currentSecondOfDay = currentLocalTime.toSecondOfDay();
            var targetSecondOfDay = targetLocalTime.toSecondOfDay();

            var waitSecondOfDay = 0;
            if (targetSecondOfDay > currentSecondOfDay) {
                waitSecondOfDay = targetSecondOfDay - currentSecondOfDay;
            } else if (targetSecondOfDay < currentSecondOfDay) {
                waitSecondOfDay = (24 * 60 * 60 - currentSecondOfDay) + targetSecondOfDay;
            }

            var toLocalTime = LocalTime.ofSecondOfDay(waitSecondOfDay);
            System.out.println(toLocalTime.format(formatter));
        }
    }
}