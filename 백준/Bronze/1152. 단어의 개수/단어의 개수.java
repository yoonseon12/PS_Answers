import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if (" ".equals(str)) {
			System.out.println(0);
		}
		else {
			str = str.trim();
			System.out.println(str.split(" ").length);
		}
	}
}