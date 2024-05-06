import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int W, H;
    static int[][] map;
    static boolean[][] isVisit;
    static int[] move_x = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] move_y = {1, 1, 0, -1, -1, -1, 0, 1};
    static final String END_INPUT_CONDITION = "0 0";

    public static void main(String[] args) throws IOException {

        String readLine = null;
        StringBuilder sb = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while ((readLine = br.readLine()) != null && !END_INPUT_CONDITION.equals(readLine)) {
                StringTokenizer st = new StringTokenizer(readLine);
                W = Integer.parseInt(st.nextToken());
                H = Integer.parseInt(st.nextToken());

                map = new int[H][W];
                isVisit = new boolean[H][W];

                for (int i=0; i<H; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j=0; j<W; j++) {
                        map[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                int count= 0;
                for (int i=0; i<H; i++) {
                    for (int j=0; j<W; j++) {
                        if (map[i][j] == 1 && !isVisit[i][j]) {
                            count++;
                            DFS(i,j);
                        }
                    }
                }
                sb.append(count+"\n");
            }

            System.out.println(sb.toString().trim());
        }
    }

    private static void DFS(int x, int y) {
        isVisit[x][y] = true;
        for (int i=0; i<8; i++) {
            int next_x = x + move_x[i];
            int next_y = y + move_y[i];
            if (isMoveLimit(next_x, next_y) && !isVisit[next_x][next_y] && map[next_x][next_y] == 1) {
                DFS(next_x, next_y);
            }
        }
    }

    private static boolean isMoveLimit(int x, int y) {
        return x >= 0 && x < H && y >= 0 && y < W;
    }
}
