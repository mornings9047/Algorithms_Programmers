package level01;

public class SquareRoot {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        return Math.pow(sqrt, 2) == n ? sqrt : -1;
    }

    public static void main(String[] args) {
        long n = 121;
        long n2 = 3;

        SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.solution(n));
        System.out.println(squareRoot.solution(n2));
    }
}
