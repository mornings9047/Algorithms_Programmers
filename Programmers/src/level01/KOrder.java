package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KOrder {
    enum order {
        FROM, TO, ORDER
    }

    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int[] command : commands)
            answer.add(returnK(array, command));
        return answer;
    }

    public int returnK(int[] array, int[] command) {
        int[] list = Arrays.copyOfRange(array, command[order.FROM.ordinal()] - 1, command[order.TO.ordinal()]);
        Arrays.sort(list);
        return list[command[order.ORDER.ordinal()] - 1];
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KOrder kOrder = new KOrder();
        for (int i : kOrder.solution(array, commands))
            System.out.print(i + " ");
        System.out.println();
    }
}
