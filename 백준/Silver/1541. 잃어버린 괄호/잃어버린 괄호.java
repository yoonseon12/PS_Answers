import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String readLine = br.readLine();
		StringBuilder sb = new StringBuilder();

		String[] minusArr = readLine.split("\\-");
		int idx =0;
		for (String s : minusArr) {
			if (s.contains("+")) {
				int temp = 0;
				String[] plusArr = s.split("\\+");
				for (String ss : plusArr) {
					temp += Integer.parseInt(ss);
				}
				if (idx == 0) answer += temp; // 첫번째 인덱스였다면 더함
				else answer -= temp;

			} else {
				if (idx == 0) answer  += Integer.parseInt(s); /// 첫번째 인덱스였다면 더함
				else answer -= Integer.parseInt(s);
			}
			idx++;
		}

		System.out.println(answer);
	}
}