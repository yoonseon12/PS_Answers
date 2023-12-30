class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for (String s : arr) {
            if (!answer.contains(s)) answer+=s;
        }
        return answer;
    }
}