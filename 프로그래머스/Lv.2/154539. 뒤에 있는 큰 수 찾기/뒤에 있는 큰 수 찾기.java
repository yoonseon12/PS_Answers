import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<numbers.length; i++) {
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                int index = stack.pop();
                answer[index] = numbers[i];
            }
            stack.push(i);
        }

        // for (int j=i+1; j<numbers.length; j++) {
        //     if (numbers[i] < numbers[j]) {
        //         answer[i] = numbers[j];
        //         break;
        //     }
        //     if (j == numbers.length-1) {
        //         answer[i] = -1;
        //     }
        // }
        // if (answer[numbers.length-1] <= answer[numbers.length-2]) {
        //         answer[numbers.length-1] = -1;
        // }
        
        return answer;
    }
}