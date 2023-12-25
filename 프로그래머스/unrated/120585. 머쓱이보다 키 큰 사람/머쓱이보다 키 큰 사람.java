import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        return (int) Arrays.stream(array)
            .filter(n -> n > height)
            .count();
    }
}