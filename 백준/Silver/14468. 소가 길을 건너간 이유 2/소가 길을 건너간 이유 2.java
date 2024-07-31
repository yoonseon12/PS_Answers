import java.io.*;
import java.util.*;

public class Main {

    static String str;
    static Map<Character, int[]> positionMap;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        positionMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();

            for (int i = 0; i < str.length(); i++) {
                char cow = str.charAt(i);
                if (!positionMap.containsKey(cow)) {
                    positionMap.put(cow, new int[2]);
                    positionMap.get(cow)[0] = i;
                } else {
                    positionMap.get(cow)[1] = i;
                }
            }

            for (char cow = 'A'; cow <= 'Z'; cow++) {
                int start1 = positionMap.get(cow)[0];
                int end1 = positionMap.get(cow)[1];

                for (char cow2 = (char)(cow + 1); cow2 <= 'Z'; cow2++) {
                    int start2 = positionMap.get(cow2)[0];
                    int end2 = positionMap.get(cow2)[1];

                    if (start1 < start2 && start2 < end1 && end1 < end2 ||
                        start2 < start1 && start1 < end2 && end2 < end1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}