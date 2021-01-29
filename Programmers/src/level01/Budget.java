package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Budget {
    public int solution(int[] d, int budget) {
        int max = 0;
        int sum = 0;
        int index = 0;
        boolean[] used = new boolean[d.length];
        List list = new ArrayList<Integer>();
        Arrays.sort(d);

        while (index != d.length - 1) {
            while (sum + d[index] < budget) {
                list.add(d[index]);
                sum += d[index];
                max++;
                used[index++] = true;
                printList(list);
            }
            list.remove(--index);
            sum -= d[index];
            used[index] = false;
            max--;
        }
//        printList(list);
//        System.out.println(index);

        return max;
    }

    public void printList(List<Integer> list) {
        for (int i : list)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget1 = 9;
        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;

        Budget budget = new Budget();
        budget.solution(d, budget1);
//        System.out.println(budget.solution(d, budget1));
//        System.out.println(budget.solution(d2, budget2));
    }
}
