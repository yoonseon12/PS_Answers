import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    static int N, M;
    static int[] arr, delta;

    public static void main(String[] args) throws Exception{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

            delta = new int[N+2];
            for (int i=0; i<M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                // 각 지시에 따른 변화량 기록
                delta[a] += k;
                delta[b+1] -= k;
            }

            // 각 칸부터의 변화량을 각 칸에 기록
            // sumDelta = new int[N+1];
            int plus = 0;
            for (int i=1; i<=N; i++) {
                if (delta[i] != 0) {
                    plus += delta[i];
                }
                arr[i-1] += plus;
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

}
