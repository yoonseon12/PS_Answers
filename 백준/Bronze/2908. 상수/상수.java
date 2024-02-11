import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder(st.nextToken());
		int A = Integer.parseInt(sb.reverse().toString());
		sb = new StringBuilder(st.nextToken());
		int B = Integer.parseInt(sb.reverse().toString());
		System.out.println(Math.max(A,B));
	}
}
