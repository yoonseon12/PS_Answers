import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int N, current_x, current_y;
    static int minIndex_x, minIndex_y, maxIndex_x, maxIndex_y;
    static char[] moves;
    static char[][] map;
    static final char LEFT = 'L', RIGHT = 'R';
    static char currentDirection;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            moves = br.readLine().toCharArray();

            map = new char[100][100];
            for (char[] row : map) {
                Arrays.fill(row, '#');
            }

            current_x = 50;
            current_y = 50;
            map[current_y][current_x] = '.';

            currentDirection = 'S';
            for (char c : moves) {
                if (c == LEFT) turnLeft();
                else if (c == RIGHT) turnRight();
                else moveForward();
            }

            removeMap();
            printMap();
        }
    }

    private static void removeMap() {
         minIndex_x = minIndex_y = map.length-1;
         maxIndex_x = maxIndex_y = 0;
        for (int i=0; i<map.length; i++) {
            for (int j=0; j<map.length; j++) {
                if (map[i][j] != '#') {
                    minIndex_x = Math.min(j, minIndex_x);
                    minIndex_y = Math.min(i, minIndex_y);
                    maxIndex_x = Math.max(j, maxIndex_x);
                    maxIndex_y = Math.max(i, maxIndex_y);
                }
            }
        }
    }

    private static void printMap() {
        StringBuilder sb = new StringBuilder();
        for (int i=minIndex_y; i<=maxIndex_y; i++) {
            for (int j=minIndex_x; j<=maxIndex_x; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    private static void moveForward() {
        if (currentDirection == 'S') current_y++;
        else if (currentDirection == 'W') current_x--;
        else if (currentDirection == 'N') current_y--;
        else if (currentDirection == 'E') current_x++;
        map[current_y][current_x] = '.';
    }

    private static void turnRight() {
        if (currentDirection == 'S') currentDirection = 'W';
        else if (currentDirection == 'W') currentDirection = 'N';
        else if (currentDirection == 'N') currentDirection = 'E';
        else if (currentDirection == 'E') currentDirection = 'S';
    }

    private static void turnLeft() {
        if (currentDirection == 'S') currentDirection = 'E';
        else if (currentDirection == 'W') currentDirection = 'S';
        else if (currentDirection == 'N') currentDirection = 'W';
        else if (currentDirection == 'E') currentDirection = 'N';
    }
}