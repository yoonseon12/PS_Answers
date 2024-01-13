import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorts = Arrays.copyOf(emergency,emergency.length);
        Arrays.sort(sorts);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<sorts.length; i++) {
            map.put(sorts[i], sorts.length-i);
        }
        for (int i=0; i<sorts.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}