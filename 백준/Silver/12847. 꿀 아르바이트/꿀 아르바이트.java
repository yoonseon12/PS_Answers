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
		int lt = 0, rt = m-1;
		long answer = sum;
		while (rt < n-1) {
			sum -= arr[lt];
			sum += arr[rt+1];
			answer = Math.max(answer, sum);
			lt++;
			rt++;
		}
		System.out.println(answer);
	}
}