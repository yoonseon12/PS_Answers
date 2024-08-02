import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, X;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            X = Integer.parseInt(br.readLine());

            Arrays.sort(arr);

            int count = 0;
            int lt = 0;
            int rt = N-1;
            while (lt < rt) {
                int sum = arr[lt] + arr[rt];
                if (sum == X) {
                    count ++;
                    lt++;
                } else if (sum > X){
                    rt--;
                } else {
                    lt++;
                }
            }
            System.out.println(count);
        }
    }
}
