import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (String[] loginInfo : db) {
            if (Arrays.equals(id_pw, loginInfo)) {
                answer = "login";
                break;
            } else if (id_pw[0].equals(loginInfo[0])) {
                answer = "wrong pw";
                break;
            } else { 
                answer = "fail";
            }
        }
        return answer;
    }
}
