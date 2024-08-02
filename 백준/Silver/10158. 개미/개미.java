import java.io.*;

public class Main {
    static int T;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] mapArr = br.readLine().split(" ");
            String[] currentArr = br.readLine().split(" ");
            T = Integer.parseInt(br.readLine());

            int width = Integer.parseInt(mapArr[0]);
            int height = Integer.parseInt(mapArr[1]);

            int current_x = Integer.parseInt(currentArr[0]);
            int current_y = Integer.parseInt(currentArr[1]);

            int result_x = (current_x + T) % (2 * width);
            if (result_x > width) {
                result_x = 2 * width - result_x;
            }
            int result_y = (current_y + T) % (2 * height);
            if (result_y > height) {
                result_y = 2 * height - result_y;
            }

            System.out.println(result_x+" "+result_y);
        }
    }
}