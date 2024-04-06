import java.util.*;

class Solution {
    static int answer;
    static Stack<Integer> basket;
    
    public int solution(int[][] board, int[] moves) {
        basket = new Stack<>();
        for (int crane : moves) {
            for (int i=0; i<board.length; i++) {
                int doll = board[i][crane-1];
                if (doll != 0) {
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        answer+=2;
                    } else {
                        basket.push(doll);
                    }
                    board[i][crane-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}