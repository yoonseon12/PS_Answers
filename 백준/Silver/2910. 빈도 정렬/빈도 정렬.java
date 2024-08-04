import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static int N, C;

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            List<Integer> origin = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<N; i++) {
                int value = Integer.parseInt(st.nextToken());
                list.add(value);
                origin.add(value);
                map.put(value, map.getOrDefault(value, 0) + 1);
            }

            Collections.sort(list, (e1, e2) -> {
                if (map.get(e2) == map.get(e1)) {
                    return origin.indexOf(e1) - origin.indexOf(e2);
                }
                return Integer.compare(map.get(e2), map.get(e1));
            });
            
            StringBuilder sb = new StringBuilder();
            for(int i : list) {
                sb.append(i+" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}