import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, S, result = Integer.MAX_VALUE;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());
            arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            
            int lt = 0;
            int rt = 0;
            int sum = 0;
            int count = 0;
            while (rt < N) {
                sum += arr[rt];
                rt++;
                count++;
                if (sum >= S) {
                    result = Math.min(result, count);
                    while (sum >= S) {
                        sum -= arr[lt];
                        count--;
                        lt++;
                        if (sum >= S) {
                            result = Math.min(result, count);
                        }
                    }
                }
            }

            result = result == Integer.MAX_VALUE ? 0 : result;
            System.out.println(result);
        }
    }
}
