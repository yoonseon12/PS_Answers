import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] arr, sums;

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[N][N];
            sums = new int[N+1][N+1];
            for (int i=0; i<N; i++) {
                String[] strArr = br.readLine().split(" ");
                int sum = 0;
                for (int j=0; j<N; j++) {
                    arr[i][j] = Integer.parseInt(strArr[j]);
                    sum += arr[i][j];
                    sums[i+1][j+1] = sum;
                }
            }

            for (int i=0; i<M; i++) {
                String[] strArr = br.readLine().split(" ");
                int start_x = Integer.parseInt(strArr[0]);
                int start_y = Integer.parseInt(strArr[1]);
                int end_x = Integer.parseInt(strArr[2]);
                int end_y = Integer.parseInt(strArr[3]);
                System.out.println(prefixSum(start_x, start_y, end_x, end_y));
            }
        }
    }

    public static int prefixSum(int start_x, int start_y, int end_x, int end_y) {
        if (start_x == end_x && start_y == end_y) {
            return arr[start_x-1][start_y-1];
        }

        int sum = 0;
        for (int i=start_x; i<=end_x; i++) {
            int end = sums[i][end_y];
            int start = sums[i][start_y-1];
            sum += (end - start);
        }
        return sum;
    }
}
