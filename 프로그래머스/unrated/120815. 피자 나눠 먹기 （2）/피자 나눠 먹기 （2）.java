class Solution {
    public int solution(int n) {
        int pizzaPiece = 6;
        while (pizzaPiece%n != 0) {
            pizzaPiece += 6;
        }
        return pizzaPiece/6;
    }
}