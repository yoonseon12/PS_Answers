import java.io.*;
import java.util.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());

            Set<String> employeeSet = new LinkedHashSet<>();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String commute = st.nextToken();
                if ("leave".equals(commute)) {
                    employeeSet.remove(name);
                } else {
                    employeeSet.add(name);
                }
            }
            List<String> employeeList = new ArrayList<>(employeeSet);
            Collections.sort(employeeList, Collections.reverseOrder());

            employeeList.forEach(System.out::println);
        }
    }
}