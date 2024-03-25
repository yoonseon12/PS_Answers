class Solution {
    public int solution(int[] money) {
        // 첫 번째 부터 시작했을 때
        int[] selectFirst = new int[money.length];
        selectFirst[0] = money[0];
        selectFirst[1] = money[1];
        selectFirst[2] = money[2] + money[0];
        for (int i=3; i<money.length-1; i++) {
            selectFirst[i] = money[i] + Math.max(selectFirst[i-3], selectFirst[i-2]);
        }
        int selectFirstMaxValue = Math.max(selectFirst[money.length-2], selectFirst[money.length-3]);

        // 두 번째 부터 시작했을 때
        int[] selectSecond = new int[money.length];
        selectSecond[1] = money[1];
        selectSecond[2] = money[2];
        selectSecond[3] = money[3]+money[1];
        for (int i=4; i<money.length; i++) {
            selectSecond[i] = money[i] + Math.max(selectSecond[i-3], selectSecond[i-2]);
        }
        int selectSecondMaxValue = Math.max(selectSecond[money.length-1], selectSecond[money.length-2]);

        return Math.max(selectFirstMaxValue, selectSecondMaxValue);
    }
}