class Solution {
    public int solution(String my_string) {
        return my_string.chars()
            .filter(Character::isDigit)
            .map(Character::getNumericValue)
            .sum();
    }
}