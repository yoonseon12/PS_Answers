import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int arr[] = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for (int i : arr) {
			sb.append(i+" ");
		}
		System.out.println(sb.toString());
	}
}
