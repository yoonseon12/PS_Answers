class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i : num_list) {
            answer[ i % 2 ] ++;
        }
        return answer;
    }
}