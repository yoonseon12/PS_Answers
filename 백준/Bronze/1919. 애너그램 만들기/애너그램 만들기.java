import java.util.*;
import java.io.*;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str1 = br.readLine();
            String str2 = br.readLine();
            int[] alphabetCount1 = getAlphabetCountArr(str1);
            int[] alphabetCount2 = getAlphabetCountArr(str2);

            for (int i=0; i<26; i++) {
                count += Math.abs(alphabetCount1[i]-alphabetCount2[i]);
            }

            System.out.println(count);
        }
    }

    private static int[] getAlphabetCountArr(String str) {
        int[] countArr = new int[26];

        for(int i=0; i<str.length(); i++) {
            countArr[str.charAt(i) - 'a']++;
        }

        return countArr;
    }

}