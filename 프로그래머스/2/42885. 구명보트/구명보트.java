import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int boats = 0, lt = 0;
        Arrays.sort(people);
        for (int i=people.length-1; i >= lt; i--) {
            if (people[i] + people[lt] <= limit) {
                boats++;
                lt++;
            } else {
                boats++;
            }
        }
        return boats;
    }
}