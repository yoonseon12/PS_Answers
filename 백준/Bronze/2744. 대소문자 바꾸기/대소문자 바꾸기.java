import java.io.*;

public class Main {

    static String answer = "";

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    answer += Character.toLowerCase(c);
                } else {
                    answer += Character.toUpperCase(c);
                }
            }
            System.out.println(answer);
        }
    }
}