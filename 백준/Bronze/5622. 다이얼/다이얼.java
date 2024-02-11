import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] dial = {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		int time = 0;
		for (int i=0; i<str.length(); i++) {
			String target = str.charAt(i)+"";
			for (int j=0; j<dial.length; j++) {
				if (dial[j].contains(target)) {
					time += j;
				}
			}
		}
		System.out.println(time);
	}
}