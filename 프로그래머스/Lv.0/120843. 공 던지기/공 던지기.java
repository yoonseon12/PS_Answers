class Solution {
    public int solution(int[] arr, int k) {
        int idx = 1;

        for (int i=1; i<k; i++) {
            idx+=2;
            if (idx > arr.length) {
                idx = idx % arr.length;
            }
        }

        return idx;
    }
}