import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer;

		int N = Integer.parseInt(br.readLine());
		stringTokenizer = new StringTokenizer(br.readLine());

		int[] arrN = new int[N];
		for (int i=0; i<N; i++) {
			arrN[i] = Integer.parseInt(stringTokenizer.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
		stringTokenizer = new StringTokenizer(br.readLine());

		int[] arrM = new int[M];
		for (int i=0; i<M; i++) {
			arrM[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		Arrays.sort(arrN);

		StringBuilder sb = new StringBuilder();
		for (int i : arrM) {
			int lt = 0;
			int rt = arrN.length-1;
			boolean isExists = false;
			while (lt <= rt) {
				int mid = (lt+rt)/2;
				if (arrN[mid] < i) {
					lt = mid + 1;
				} else if (arrN[mid] > i){
					rt = mid -1;
				} else {
					isExists = true;
					break;
				}
			}
			if (isExists) {
				sb.append(1+" ");
			} else {
				sb.append(0+" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
}