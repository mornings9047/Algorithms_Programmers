package level01;

public class SumBetweenNums {
    public long solution(int start, int end) {
        return start < end ? sumNumbers(start, end) : sumNumbers(end, start);
    }

    public long sumNumbers(int start, int end) {
        int length = end - start + 1;
        return (long) (start + end) * length / 2;
    }

    public static void main(String[] args) {
        int a = 1;  int b = 4;
        int a2 = 3; int b2 = 3;
        int a3 = 5; int b3 = 3;
        int a4 = 1; int b4 = 10000000;
        SumBetweenNums sumBetweenNums = new SumBetweenNums();
        System.out.println(sumBetweenNums.solution(a, b));
        System.out.println(sumBetweenNums.solution(a2, b2));
        System.out.println(sumBetweenNums.solution(a3, b3));
        System.out.println(sumBetweenNums.solution(a4, b4));
    }
}
