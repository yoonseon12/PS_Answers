import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList();
        for(int i=0; i<progresses.length; i++) {
            queue.add((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        while (!queue.isEmpty()) {
            int progress = queue.poll();
            int count= 1;
            while (!queue.isEmpty() && queue.peek() <= progress) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}