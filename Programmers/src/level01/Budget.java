package level01;

import java.util.Arrays;

public class Budget {
    public int solution(int[] arr, int budget) {
        int productCnt = 0;

        int sum = 0;
        Arrays.sort(arr);
        for (int money : arr) {
            if (sum + money <= budget) {
                sum += money;
                productCnt++;
            } else
                break;
        }
        return productCnt;
    }

    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget1 = 9;
        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;

        Budget budget = new Budget();
        System.out.println(budget.solution(d, budget1));
        System.out.println(budget.solution(d2, budget2));
    }
}
