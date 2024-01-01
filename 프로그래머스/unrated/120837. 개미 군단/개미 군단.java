class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] powers = {5, 3, 1};
        for (int power : powers) {
            if (hp/ power != 0) {
                answer += hp/power;
                hp %= power;
            }
        }

        return answer;
    }
}