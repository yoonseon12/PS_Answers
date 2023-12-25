import java.util.HashMap;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashMap<String ,Integer> map = new HashMap<>();
        for (String s : s1) 
            map.put(s, 0);
        for (String s : s2) 
            if (map.get(s) != null)
                answer ++;
        
        return answer;
    }
}