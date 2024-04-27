import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static Stack<Integer> stack;
    static StringBuilder sb;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            stack = new Stack<>();
            sb = new StringBuilder();

            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                if (command.equals("push"))  {
                    stack.push(Integer.parseInt(st.nextToken()));
                    continue;
                } else if (command.equals("top")) {
                    if (stack.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.peek());
                    }
                } else if (command.equals("size")) {
                    sb.append(stack.size());
                } else if (command.equals("empty")) {
                    sb.append(stack.isEmpty() ? 1 : 0);
                } else if (command.equals("pop")) {
                    if (stack.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.pop());
                    }
                }
                sb.append("\n");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
