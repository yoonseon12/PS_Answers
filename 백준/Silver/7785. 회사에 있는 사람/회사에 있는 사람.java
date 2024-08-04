import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());

            Map<String,String> commuteMap = new HashMap<>(N);

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String commute = st.nextToken();
                if ("leave".equals(commute)) {
                    commuteMap.remove(name);
                } else {
                    commuteMap.put(name,commute);
                }
            }
            List<String> list = new ArrayList<>();
            for (String key: commuteMap.keySet()) {
                list.add(key);
            }
            Collections.sort(list, Collections.reverseOrder());

            list.forEach(System.out::println);
        }
    }
}