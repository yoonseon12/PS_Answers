import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] times;

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            times = new int[N][2];
            for (int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                times[i][0] = Integer.parseInt(st.nextToken());
                times[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(times, (e1, e2) -> {
                if (e1[1] == e2[1]) {
                    return Integer.compare(e1[0], e2[0]);
                }
                return Integer.compare(e1[1], e2[1]);
            });

            int count = 0;
            int end = 0;
            for (int[] time : times) {
                int start = time[0];
                int endTime = time[1];
                if (start >= end) {
                    count++;
                    end = endTime;
                }
            }

            System.out.println(count);
        }
    }
}
