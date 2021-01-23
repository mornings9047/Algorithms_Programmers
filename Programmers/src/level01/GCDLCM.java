package level01;

public class GCDLCM {
    public long[] solution(int n, int m) {
        long[] answer = new long[2];
        answer[0] = n < m ? gcd(n, m) : gcd(m, n);
        answer[1] = lcm(answer[0], n, m);
        return answer;
    }

    public long gcd(int n, int m) {
        int max = 1;
        if (m % n == 0)
            return n;
        for (int i = 2; i < n; i++)
            if (n % i == 0 && m % i == 0)
                max = i;
        return max;
    }

    public long lcm(long division, int n, int m) {
        return (m / division) * n;
    }

    public static void main(String[] args) {
        int n = 8;          int m = 12;
        int n2 = 2;         int m2 = 5;
        int n3 = 8;         int m3 = 12;
        int n4 = 27;        int m4 = 15;
        int n5 = 999999;    int m5 = 999998;

        GCDLCM gcdlcm = new GCDLCM();
        for (long i : gcdlcm.solution(n, m))
            System.out.print(i + " ");
        System.out.println();
        for (long i : gcdlcm.solution(n2, m2))
            System.out.print(i + " ");
        System.out.println();
        for (long i : gcdlcm.solution(n3, m3))
            System.out.print(i + " ");
        System.out.println();
        for (long i : gcdlcm.solution(n4, m4))
            System.out.print(i + " ");
        System.out.println();
        for (long i : gcdlcm.solution(n5, m5))
            System.out.print(i + " ");
    }
}
