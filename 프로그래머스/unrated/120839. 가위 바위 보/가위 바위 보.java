import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return rsp.chars()
            .map(i -> i == '2' ? '0' : (i == '0' ? '5' : '2'))
            .mapToObj(Character::getNumericValue)
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}