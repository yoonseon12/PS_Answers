import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int N;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());

            list = new ArrayList<>();
            for (int i=0; i<N; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }
            Collections.sort(list);

            StringBuilder sb = new StringBuilder();
            for(int i : list) {
                sb.append(i+"\n");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
