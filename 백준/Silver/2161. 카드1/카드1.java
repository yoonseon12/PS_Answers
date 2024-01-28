import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		Queue<Integer> queue = new LinkedList<>();
		for (int i=1; i<=N; i++) {
			queue.offer(i);
		}

		while (!queue.isEmpty()) {
            sb.append(queue.poll()+" ");
			if (queue.peek() == null) {
				break;
			}
			queue.offer(queue.poll());
		}

		System.out.println(sb.toString().trim());
	}
}