package level01;

import java.util.*;

public class SumAndSort {
    public int[] solution(int[] numbers) {
        Set<Integer> sum = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = i + 1; j < numbers.length; j++)
                sum.add(numbers[i] + numbers[j]);

        List<Integer> order = new ArrayList<>(sum);
        Collections.sort(order);
        int length = order.size();
        int[] answer = new int[length];
        for (int i = 0; i < length; i++)
            answer[i] = order.get(i);
        return answer;
    }

    public static void main(String[] args) {
        SumAndSort sumAndSort = new SumAndSort();
        int[] numbers = {2, 1, 3, 4, 1};
        for (int i : sumAndSort.solution(numbers))
            System.out.print(i + " ");
        System.out.println();
        int[] numbers2 = {5, 0, 2, 7};
        for (int i : sumAndSort.solution(numbers2))
            System.out.print(i + " ");
    }
}