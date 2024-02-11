import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			for (char c : S.toCharArray()) {
				sb.append((c+"").repeat(R));
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}