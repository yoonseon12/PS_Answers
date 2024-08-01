import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String str;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine().toLowerCase();

            int[] countArr = new int[26];

            for (int i=0; i<str.length(); i++) {
                countArr[str.charAt(i) -'a'] ++;
            }

            int maxCount = Integer.MIN_VALUE;
            char maxValue = '?';
            for (int i=0; i<26; i++) {
                if (countArr[i] > maxCount) {
                    maxCount = countArr[i];
                    maxValue = (char)(i + 'A');
                } else if (maxCount == countArr[i]) {
                    maxValue = '?';
                }
            }

            System.out.println(maxValue);
        }
    }
}