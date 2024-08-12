import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    static int N, M;
    static int[] arr, sums;

    public static void main(String[] args) throws Exception{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            sums = new int[N+1];

            for (int i=0; i<M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                buildDirt(a, b, k);
            }

            for(int i=0; i<N; i++) {
                arr[i] += sums[i+1];
            }

            System.out.println(arrayToString());
        }
    }

    private static String arrayToString() {
        return Arrays.stream(arr)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "))
            .trim();
    }

    private static void buildDirt(int a, int b, int k) {
        for (int i=a; i<=b; i++) {
            sums[i] += k;
        }
    }
}
