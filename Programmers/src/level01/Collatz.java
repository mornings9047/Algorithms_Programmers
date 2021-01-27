package level01;

public class Collatz {
    public int solution(long num) {
        int cnt = 0;
        while (num != 1) {
            if (num % 2 == 0)
                num /= 2;
            else
                num = num * 3 + 1;
            cnt++;
            if (cnt > 500)
                return -1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        long n = 6;
        long n2 = 16;
        long n3 = 626331;

        Collatz collatz = new Collatz();
        System.out.println(collatz.solution(n));
        System.out.println(collatz.solution(n2));
        System.out.println(collatz.solution(n3));
    }
}
