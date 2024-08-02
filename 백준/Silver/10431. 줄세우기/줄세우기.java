import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int P;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            P = Integer.parseInt(br.readLine());

            for (int i = 0; i < P; i++) {
                String line = br.readLine();
                String[] arr = line.split(" ");
                int T = Integer.parseInt(arr[0]);
                int[] students = new int[20];
                for (int j=0; j<20; j++) {
                    students[j] = Integer.parseInt(arr[j+1]);
                }

                int count = 0;

                for (int j=0; j<20; j++) {
                    for (int k=0; k<j; k++) {
                        if (students[j] < students[k]) {
                            count++;
                        }
                    }
                }

                System.out.println(T+" "+count);
            }
        }
    }
}
