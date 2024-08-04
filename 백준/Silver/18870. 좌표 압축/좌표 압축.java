import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

            List<Integer> list = new ArrayList<>();
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                list.add(arr[i]);
                set.add(arr[i]);
            }

            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> listBySet = new ArrayList<>(set);
            for (int i = 0; i < listBySet.size(); i++) {
                map.put(listBySet.get(i), i);
            }

            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(map.get(i) + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
