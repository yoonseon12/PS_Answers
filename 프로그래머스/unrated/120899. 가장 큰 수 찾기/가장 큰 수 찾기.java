class Solution {
    public int[] solution(int[] array) {
        int maxIndex = 0;
        int maxValue = array[maxIndex];
        for (int i=1; i<array.length; i++) {
            if (array[i] > maxValue) {
                maxIndex = i;
                maxValue = array[i];
            }
        }
        return new int[]{maxValue, maxIndex};
    }
}