class Solution {
    public int solution(int[] dot) {
        if (dot[0] * dot[1] > 0) {
            return dot[0] > 0 ? 1 : 3;
        } else {
            return dot[0] > 0 ? 4 : 2;
        }
    }
}