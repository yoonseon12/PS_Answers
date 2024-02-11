import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			if (line == null || line.isEmpty())
				break;
			System.out.println(line);
		}
	}
}