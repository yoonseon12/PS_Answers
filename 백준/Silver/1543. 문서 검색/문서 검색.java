import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            String target = br.readLine();

            int targetLength = target.length();
            int lt = 0;
            int rt = targetLength;
            int count = 0;
            while (rt <= str.length()) {
                if (target.equals(str.substring(lt, rt))) {
                    count++;
                    lt += targetLength;
                    rt += targetLength;
                } else {
                    lt++;
                    rt++;
                }
            }

            System.out.println(count);
        }
    }
}