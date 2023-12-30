class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += String.valueOf(c).toLowerCase();
            } else {
                answer += String.valueOf(c).toUpperCase();
            }
        }
    
        return answer;
    }
}