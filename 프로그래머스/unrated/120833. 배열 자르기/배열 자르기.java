import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2)
            .map(i -> numbers[i])
            .toArray();
    }
}