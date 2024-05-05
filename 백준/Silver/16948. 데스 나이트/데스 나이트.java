import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] map;
    static int[] startPoint, endPoint;
    static boolean[][] isVisit;
    static Queue<Integer[]> queue;
    static int[] move_x = {-2, -2, 0, 0, 2, 2};
    static int[] move_y = {-1, 1, -2, 2, -1, 1};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            startPoint = new int[2];
            startPoint[0] = Integer.parseInt(st.nextToken());
            startPoint[1] = Integer.parseInt(st.nextToken());
            endPoint = new int[2];
            endPoint[0] = Integer.parseInt(st.nextToken());
            endPoint[1] = Integer.parseInt(st.nextToken());

            map = new int[N+1][N+1];
            isVisit = new boolean[N+1][N+1];

            int result = BFS(startPoint);

            System.out.println(result);
        }
    }

    private static int BFS(int[] startPoint) {
        int startPoint_x = startPoint[0];
        int startPoint_y = startPoint[1];
        queue = new LinkedList<>();
        queue.offer(new Integer[]{startPoint_x, startPoint_y});
        isVisit[startPoint_x][startPoint_y] = true;

        while (!queue.isEmpty()) {
            Integer[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x == endPoint[0] && y == endPoint[1]) {
                return map[x][y];
            }

            move(x, y);

        }
        return -1;
    }

    private static boolean isMoveLimit(int x, int y) {
        return x >= 0 && x <= N && y >= 0 && y <= N;
    }

    private static void move(int x, int y) {
        for (int i=0; i<6; i++) {
            int next_x = x + move_x[i];
            int next_y = y + move_y[i];
            if (isMoveLimit(next_x, next_y) && !isVisit[next_x][next_y]) {
                isVisit[next_x][next_y] = true;
                map[next_x][next_y] = map[x][y] + 1;
                queue.offer(new Integer[]{next_x, next_y});
            }
        }
    }
}
