import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i=0; i<s.length(); i++) {
            if (isBracket(sb.toString())) {
                answer++;
            }
            sb.append(sb.charAt(0));
            sb.delete(0,1);
        }

        return answer;
    }

    public boolean isBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char pop = stack.pop();
                    if (pop == '(' && c != ')' ||
                        pop == '{' && c != '}' ||
                        pop == '[' && c != ']') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}