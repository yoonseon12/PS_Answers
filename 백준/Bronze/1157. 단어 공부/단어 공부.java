import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            var str = br.readLine().toLowerCase();
            var countMap = new int[26];
            str.chars().forEach(c -> {
                countMap[c - 'a']++;
            });

            var maxCount = Integer.MIN_VALUE;
            var maxValue = '?';
            for (int i=0; i<26; i++) {
                if (maxCount < countMap[i]) {
                    maxCount = countMap[i];
                    maxValue = (char)(i + 'A');
                } else if (countMap[i] == maxCount) {
                    maxValue = '?';
                }
            }

            System.out.println(maxValue == '?' ? "?" : maxValue);
        }
    }
}