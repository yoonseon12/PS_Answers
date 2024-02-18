import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		String[] seats = new String[N];
		for (int i=0; i<N; i++) {
			seats[i] = br.readLine();
		}
        if (M < K) {
			System.out.println(0);
			return ;
		}
		String emptySeat = "";
		for (int i=0; i<K; i++) {
			emptySeat +="0";
		}

		int answer = 0;
		for (String seat : seats) {
			int rt = K;
			String temp = seat.substring(0, K);
			if (temp.equals(emptySeat)) answer++;
			while(rt < M) {
				temp = temp.substring(1, K);
				temp += seat.charAt(rt);
				if (temp.equals(emptySeat)) {
					answer++;
				}
				rt++;
			}
		}
		System.out.println(answer);
	}
}