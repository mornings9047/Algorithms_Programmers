package level01;

import java.util.Arrays;

public class DescendingString {
    public String solution(String word) {
        char[] characters = word.toCharArray();
        Arrays.sort(characters);
        StringBuilder buffer = new StringBuilder(String.valueOf(characters));
        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
        String word = "Zbcdefg";
        DescendingString descendingString = new DescendingString();
        System.out.println(descendingString.solution(word));
    }
}
