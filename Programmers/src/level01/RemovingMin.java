package level01;

import java.util.ArrayList;
import java.util.List;

public class RemovingMin {
    public List<Integer> solution(int[] arr) {
        int min = 999999;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        list.remove(index);
        if (list.isEmpty())
            list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] arr2 = {10};

        RemovingMin removingMin = new RemovingMin();
        for (int i : removingMin.solution(arr))
            System.out.print(i + " ");
        System.out.println();
        for (int i : removingMin.solution(arr2))
            System.out.print(i + " ");
    }
}
