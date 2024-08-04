import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static String[][] persons;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            persons = new String[N][2];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                persons[i][0] = st.nextToken();
                persons[i][1] = st.nextToken();
            }

            Arrays.sort(persons, (p1, p2) -> Integer.parseInt(p1[0]) - Integer.parseInt(p2[0]));

            for (String[] person : persons) {
                System.out.println(person[0] + " " + person[1]);
            }
        }
    }
}