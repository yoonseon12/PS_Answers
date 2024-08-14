import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int count = toPointerArr();

            System.out.println(count);
        }
    }

    private static int toPointerArr() {
        int count = 0;
        int sum = 0;
        int lt = 0;
        int rt = 0;

        while (rt < N) {
            sum+= arr[rt];
            rt++;

            while (sum > M) {
                sum -= arr[lt];
                lt++;
            }

            if (sum == M) {
                count++;
            }
        }

        return count;
    }
}

