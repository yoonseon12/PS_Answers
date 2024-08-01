import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String currentTime = br.readLine();
            String targetTime = br.readLine();
            if (currentTime.equals(targetTime)) {
                System.out.println("24:00:00");
                return;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime localTime = LocalTime.parse(currentTime, formatter);
            LocalTime targetLocalTime = LocalTime.parse(targetTime, formatter);

            long currentSecond = localTime.toSecondOfDay();
            long targetSecond = targetLocalTime.toSecondOfDay();

            long waitLocalSecond = 0;
            if (targetSecond >= currentSecond) {
                waitLocalSecond = targetSecond - currentSecond;
            } else {
                waitLocalSecond = (24 * 60 * 60 - currentSecond) + targetSecond;
            }
            LocalTime waitTime = LocalTime.ofSecondOfDay(waitLocalSecond);
            System.out.println(formatter.format(waitTime));
        }
    }
}
