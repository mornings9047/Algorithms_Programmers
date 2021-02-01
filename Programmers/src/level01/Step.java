package level01;

public class Step {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++)
            answer[i] = (long) x * (i + 1);
        return answer;
    }

    public static void main(String[] args) {
        int x = 2;      int n = 5;
        int x2 = 4;     int n2 = 3;
        int x3 = -4;    int n3 = 2;

        Step step = new Step();
        for (long i : step.solution(x, n))
            System.out.print(i + " ");
        System.out.println();
        for (long i : step.solution(x2, n2))
            System.out.print(i + " ");
        System.out.println();
        for (long i : step.solution(x3, n3))
            System.out.print(i + " ");
        System.out.println();
    }
}
