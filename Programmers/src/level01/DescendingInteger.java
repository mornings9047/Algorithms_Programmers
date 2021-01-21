package level01;

import java.util.Arrays;

public class DescendingInteger {
    public long solution(long n) {
        String longToStr = Long.toString(n);
        char[] charArr = longToStr.toCharArray();
        Arrays.sort(charArr);

        StringBuilder builder = new StringBuilder();
        for (char c : charArr)
            builder.append(c);
        builder.reverse();
        return Long.parseLong(builder.toString());
    }

    public static void main(String[] args) {
        long n = 118372;

        DescendingInteger descendingInteger = new DescendingInteger();
        System.out.println(descendingInteger.solution(n));
    }
}
