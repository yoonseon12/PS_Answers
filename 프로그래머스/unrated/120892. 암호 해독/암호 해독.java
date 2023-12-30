class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        cipher = cipher.substring(code-1, cipher.length());
        for (int i=0; i<cipher.length(); i+=code) {
            answer+=cipher.charAt(i);
        } 
        return answer;
    }
}