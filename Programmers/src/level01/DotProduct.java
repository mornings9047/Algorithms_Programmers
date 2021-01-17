package level01;

public class DotProduct {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i] * b[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};

        DotProduct dotProduct = new DotProduct();
        System.out.println(dotProduct.solution(a, b));
        System.out.println(dotProduct.solution(a2, b2));
    }
}
