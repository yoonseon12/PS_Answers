class Solution {
    public static int solution(String A, String B) {
        int moveCount = 0;
        boolean isTrue = false;
        for (int i=0; i<A.length(); i++) {
            if (A.equals(B)) {
                isTrue = true;
                break;
            }
            char last = A.charAt(A.length()-1);
            A = last + A.substring(0,A.length()-1);
            moveCount++;
        }
        return isTrue ? moveCount : -1;
    }
}
