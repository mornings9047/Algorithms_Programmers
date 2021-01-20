package level01;

public class Digit {
    public int solution(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 123;
        int n2 = 987;

        Digit digit = new Digit();
        System.out.println(digit.solution(n));
        System.out.println(digit.solution(n2));
    }
}
