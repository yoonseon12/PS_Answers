class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        for (char c : str.toCharArray()) {
            answer += (char)(97 + Character.getNumericValue(c));
        }
        return answer;
    }
}