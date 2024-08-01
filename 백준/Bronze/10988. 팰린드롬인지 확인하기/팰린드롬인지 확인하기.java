import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            var str = br.readLine();
            var reverse = new StringBuilder(str).reverse().toString();
            var result = str.equals(reverse) ? 1 : 0;
            System.out.println(result);
        }
    }
}