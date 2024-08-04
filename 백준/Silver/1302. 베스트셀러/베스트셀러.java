import java.io.*;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new TreeMap<>();
            for (int i = 0; i < N; i++) {
                String book = br.readLine();
                map.put(book, map.getOrDefault(book, 0) + 1);
            }

            int count = Integer.MAX_VALUE;
            String maxCountBook = "";
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (count == Integer.MAX_VALUE) {
                    count = entry.getValue();
                    maxCountBook = entry.getKey();
                } else if (count < entry.getValue()) {
                    count = entry.getValue();
                    maxCountBook = entry.getKey();
                }
            }

            System.out.println(maxCountBook);
        }
    }
}