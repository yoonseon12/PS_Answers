import java.util.ArrayList;
import java.util.List;

class Solution {
    ArrayList<String> list = new ArrayList<>(List.of("aya", "ye", "woo", "ma"));
    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            for (String key : list) {
                while (s.contains(key)) {
                    s = s.replace(key,".");
                }
            }
            if (s.replace(".","").length() == 0) answer++;
        }
        return answer;
    }
}