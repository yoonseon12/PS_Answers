import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static String str;
    static Integer[] arr;

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();

            arr = str.chars()
                .map(Character::getNumericValue)
                .boxed()
                .toArray(Integer[]::new);

            Arrays.sort(arr, (a, b) -> b -a);

            Arrays.stream(arr)
                .forEach(sb::append);

            System.out.println(sb);
        }
    }
}
