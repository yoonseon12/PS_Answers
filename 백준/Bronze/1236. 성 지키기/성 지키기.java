import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static char[][] castle;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            castle = new char[N][M];
            for (int i=0; i < N; i++) {
                String line = br.readLine();
                castle[i] = line.toCharArray();
            }

            // 1. 각 행/열에 대해 경비원이 있는지 확인
            boolean[] existRow = new boolean[N];
            boolean[] existCol = new boolean[M];
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    if (castle[i][j] == 'X') {
                        existRow[i] = true;
                        existCol[j] = true;
                    }
                }
            }

            // 2. 보호받지 못하는 행/열의 개수 확인
            int needRowCount = N;
            int needColCount = M;

            for (int i=0; i<N; i++) {
                if(existRow[i]) needRowCount--;
            }
            for (int i=0; i<M; i++) {
                if(existCol[i]) needColCount--;
            }

            // 3. 둘 중 큰 값을 출력
            System.out.println(Math.max(needRowCount, needColCount));
        }
    }
}
