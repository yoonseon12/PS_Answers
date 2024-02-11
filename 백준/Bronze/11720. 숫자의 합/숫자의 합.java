import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		for (char c : str.toCharArray()) {
			sum += Character.getNumericValue(c);
		}
		System.out.println(sum);
	}
}