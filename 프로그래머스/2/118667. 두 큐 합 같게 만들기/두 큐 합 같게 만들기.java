import java.util.LinkedList;
import java.util.Queue;

class Solution {
    long q1Sum, q2Sum, wantSum;
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i=0; i<queue1.length; i++) {
            q1Sum += queue1[i];
            q2Sum += queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }
        if ((q1Sum + q2Sum) % 2 != 0) return -1;
        wantSum = (q1Sum + q2Sum) / 2;
        int count = 0;
        while(true) {
            if (count == queue1.length * 4) return -1; // 한바퀴를 다 돌았지만 원소의 합을 같게 만들 수 없음.
            if (q1Sum == wantSum) break;
            if (q1Sum > wantSum) {
                q1Sum -= q1.peek();
                q2.offer(q1.poll());
            } else {
                q1Sum += q2.peek();
                q1.offer(q2.poll());
            }
            count++;
        }
        return count;
    }
}