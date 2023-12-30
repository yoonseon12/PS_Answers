import java.util.List;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> list = List.of('a', 'e', 'i', 'o', 'u');
        for (char c : my_string.toCharArray()) {
            if (list.contains(c)) continue;
            answer+=String.valueOf(c);
        }
        return answer;
    }
}