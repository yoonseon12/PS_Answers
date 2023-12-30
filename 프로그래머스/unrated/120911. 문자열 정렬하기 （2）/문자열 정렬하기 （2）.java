import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
            .mapToObj(c -> String.valueOf((char) Character.toLowerCase(c)))
            .sorted()
            .collect(Collectors.joining());
    }
}