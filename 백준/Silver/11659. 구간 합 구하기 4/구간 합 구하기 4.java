import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] arr, sums;

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[N];
            sums = new int[N+1];
            sums[0] = 0;
            String[] strArr = br.readLine().split(" ");
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int element = Integer.parseInt(strArr[i]);
                arr[i] = element;
                sum += element;
                sums[i+1] = sum;
            }

            for (int k=0; k<M; k++) {
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());
                System.out.println(prefixSum(i, j));
            }
        }
    }

    public static int prefixSum(int i, int j) {
        int end = sums[j];
        int start = i == 0 ? 0 : sums[i-1];
        return end - start;
    }
}
