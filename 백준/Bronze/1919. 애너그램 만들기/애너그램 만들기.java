import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str1 = br.readLine();
            String str2 = br.readLine();
            Map<Character, Integer> alphabetCountMap1 = getAlphabetCountMap(str1);
            Map<Character, Integer> alphabetCountMap2 = getAlphabetCountMap(str2);

            int commonCount = 0;
            for (int i='a'; i<='z'; i++) {
                char key = (char)i;
                if (alphabetCountMap1.containsKey(key) && alphabetCountMap2.containsKey(key)) {
                    commonCount += (2 * Math.min(alphabetCountMap1.get(key), alphabetCountMap2.get(key)));
                }
            }

            System.out.println(str1.length() + str2.length() - commonCount);
        }
    }

    private static Map<Character,Integer> getAlphabetCountMap(String str) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        return map;
    }

}