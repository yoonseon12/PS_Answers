class Solution {
    public int[] solution(String my_string) {
        return my_string.chars()
            .filter(Character::isDigit)
            .sorted()
            .map(Character::getNumericValue)
            .toArray();
    }
}