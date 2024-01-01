class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");
        for (String s : str) {
            if ("a".equals(s) || "A".equals(s)) answer += "A";
            else answer += s.toLowerCase();
        }
        return answer;
    }
}