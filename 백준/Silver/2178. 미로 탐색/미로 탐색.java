import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] map;
    static int[][] visited;
    static Queue<Integer[]> queue;
    static int[] move_x = {-1, 0, 1, 0};
    static int[] move_y = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            map = new int[N+1][M+1];
            visited = new int[N+1][M+1];

            for (int i=1; i<=N; i++) {
                String line = br.readLine();
                for (int j=1; j<=M; j++) {
                    int numericValue = Character.getNumericValue(line.charAt(j-1));
                    map[i][j] = numericValue;
                }
            }

            int result = BFS(1, 1);

            System.out.println(result);
        }
    }

    private static int BFS(int x, int y) {
        queue = new LinkedList<>();
        visited[x][y] = 1;
        queue.offer(new Integer[]{x, y});

        while (!queue.isEmpty()) {
            Integer[] poll = queue.poll();
            int current_x = poll[0];
            int current_y = poll[1];
            if (current_x == N && current_y == M) {
                return visited[current_x][current_y];
            }

            move(current_x, current_y);
        }
        return -1;
    }

    private static void move(int current_x, int current_y) {
        for (int i=0; i<move_x.length; i++) {
            int next_x = current_x + move_x[i];
            int next_y = current_y + move_y[i];
            if (isMoveLimit(next_x, next_y) && visited[next_x][next_y] == 0 && map[next_x][next_y] == 1) {
                queue.offer(new Integer[]{next_x, next_y});
                visited[next_x][next_y] = visited[current_x][current_y] + 1;
            }
        }

    }

    private static boolean isMoveLimit(int x, int y) {
        return x >= 1 && x <= N && y >= 1 && y <= M;
    }

}
