import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int minimumIndex = 0;
        for (int i=1; i<array.length; i++) {
            if (n-array[minimumIndex] > Math.abs(n-array[i])) {
                minimumIndex = i;
            }

        }
        return array[minimumIndex];
    }
}