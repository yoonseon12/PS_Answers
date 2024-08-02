import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int N = Integer.parseInt(br.readLine());
            int[] counts = new int[10001];
            for (int i = 0; i < N; i++) {
                int number = Integer.parseInt(br.readLine());
                counts[number]++;
            }

            for(int i = 0; i < 10001; i++) {
                if (counts[i] != 0) {
                    for (int j = 0; j < counts[i]; j++) {
                        bw.write(String.valueOf(i));
                        bw.newLine();
                    }
                }
            }
            bw.flush();
        }
    }
}
