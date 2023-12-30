class Solution {
    public int solution(String my_string) {
        return my_string.chars()
            .filter(Character::isDigit) // 문자가 숫자라면 true
            .map(Character::getNumericValue)
            .sum();
    }
}