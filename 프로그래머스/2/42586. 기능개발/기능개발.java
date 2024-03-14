import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();

        for (int i=0; i<progresses.length; i++) {
            progressQueue.offer(progresses[i]);
            speedQueue.offer(speeds[i]);
        }

        int day = 0;
        int count = 0;
        while(!progressQueue.isEmpty()) {
            day++;
            while (!progressQueue.isEmpty() && progressQueue.peek() + (speedQueue.peek() * day) >= 100) {
                count++;
                progressQueue.poll();
                speedQueue.poll();
            }
            if (count != 0) {
                answer.add(count);
            }
            count = 0;
        }

        int[] resultArray = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            resultArray[i] = answer.get(i);
        }
        return resultArray;
    }
}