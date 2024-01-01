class Solution {
    public long solution(String numbers) {
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replace(numbers_arr[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}