import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		long sum = 0;
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i<m) sum += arr[i];
		}
		long answer = sum;
		for (int i=m; i<n; i++) {
			sum += (arr[i] - arr[i-m]);
			answer = Math.max(sum, answer);
		}
		System.out.println(answer);
	}
}