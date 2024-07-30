import java.io.*;
import java.util.*;

public class Main {

    static int N, result;
    
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            for (int i=0; i<N; i++) {
                var cowInfo = br.readLine().split(" ");
                var cowNumber = Integer.parseInt(cowInfo[0]);
                var cowDirection = Integer.parseInt(cowInfo[1]);

                if (map.containsKey(cowNumber)) {
                    if (cowDirection != map.get(cowNumber)) {
                        map.put(cowNumber, cowDirection);
                        result++;
                    }
                }

                map.put(cowNumber, cowDirection);
            }
        }
        System.out.println(result);
    }
}