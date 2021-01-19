package level01;

public class Factor {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (Math.pow(i, 2) != n)
                    sum += (n / i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12;
        int n2 = 5;
        int n3 = 121;

        Factor factor = new Factor();
        System.out.println(factor.solution(n));
        System.out.println(factor.solution(n2));
        System.out.println(factor.solution(n3));
    }
}
