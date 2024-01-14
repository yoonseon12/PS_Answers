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
    
    
    
    
//     public boolean isBracket(String s) {
// 			if (isBracket2(s, List.of('(',')')) &&
// 				isBracket2(s, List.of('{','}')) &&
// 				isBracket2(s, List.of('[',']'))) {
// 				return true;
// 			}
// 			return false;
// 		}

// 		public boolean isBracket2(String s, List<Character> brackets) {
// 			StringBuilder sb = new StringBuilder();
// 			for (char c : s.toCharArray()) {
// 				if (brackets.contains(c)) {
// 					sb.append(c);
// 				}
// 			}
// 			Stack<Character> stack = new Stack<>();
// 			for (char c : sb.toString().toCharArray()) {
// 				if (c == brackets.get(0)) {
// 					stack.push(c);
// 				} else {
// 					if (stack.isEmpty()) {
// 						return false;
// 					} else {
// 						stack.pop();
// 					}
// 				}
// 			}
// 			return stack.isEmpty() ? true : false;

// 		}
// 	}
}