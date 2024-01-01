import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[][] land) {
        int answer = 0;

        for (int i=1; i<land.length; i++) {
            for (int j = 0; j < 4; j++) {
                int maxValue = 0;
                for (int k = 0; k < 4; k++) {
                    if (j != k) {
                        maxValue = Math.max(maxValue, land[i-1][k]);
                    }
                }
                land[i][j] += maxValue;
            }
        }

        for (int i : land[land.length-1]) {
            answer = Math.max(i, answer);
        }

        return answer;
    }
}