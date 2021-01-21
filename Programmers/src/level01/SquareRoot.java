package level01;

public class SquareRoot {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        return (long) Math.pow(sqrt, 2) == n ? (long) Math.pow(sqrt + 1, 2) : -1;
    }

    public static void main(String[] args) {
        long n = 121;
        long n2 = 3;
        long n3 = 1000000000000L;

        SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.solution(n));
        System.out.println(squareRoot.solution(n2));
        System.out.println(squareRoot.solution(n3));
    }
}
