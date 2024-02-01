import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int[] cards = new int[N];
		for (int i=0; i<N; i++) {
			cards[i] = Integer.parseInt(st2.nextToken());
		}

		int result = 0;
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					int temp = cards[i] + cards[j] + cards[k];
					if (M == temp) {
						result = temp;
						break;
					} else if (result < temp && temp < M) {
						result = temp;
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
}