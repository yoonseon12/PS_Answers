class Solution {
    public int solution(int num, int k) {
        String numToString = num+"";
        String kToString = k+"";
        int index = numToString.indexOf(kToString);
        return index > -1 ? index+1 : -1;
    }
}