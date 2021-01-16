package level01;

public class PrimeNumber {
    public int solution(int n) {
        int cnt;
        if (n == 1)
            cnt = 0;
        else if (n == 2)
            cnt = 1;
        else {
            cnt = 1;
            for (int i = 3; i <= n; i += 2)
                if (isPrime(i))
                    cnt++;
        }
        return cnt;
    }

    public boolean isPrime(int num) {
        if (num == 1)
            return false;
        else if (num <= 3)
            return true;
        else if (num % 2 == 0)
            return false;

        for (int i = 3; i <= (int) Math.sqrt(num); i += 2)
            if (num % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        int n2 = 5;

        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.solution(n));
        System.out.println(primeNumber.solution(n2));
    }
}