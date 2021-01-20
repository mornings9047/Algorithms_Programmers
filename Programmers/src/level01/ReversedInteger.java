package level01;

import java.util.ArrayList;
import java.util.List;

public class ReversedInteger {
    public List<Integer> solution(long n) {
        List<Integer> integers = new ArrayList<>();
        while (n != 0) {
            integers.add((int) (n % 10));
            n /= 10;
        }
        return integers;
    }

    public static void main(String[] args) {
        int n = 12345;
        long n2 = 10000000000L;

        ReversedInteger reversedInteger = new ReversedInteger();
        for (int i : reversedInteger.solution(n))
            System.out.print(i + " ");
        System.out.println();
        for (int i : reversedInteger.solution(n2))
            System.out.print(i + " ");
        System.out.println();
    }
}
