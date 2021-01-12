package level01;

import java.util.List;
import java.util.Stack;

public class RemovedRepeatedNumbers {
    public List<Integer> solution(int[] arr) {
        Stack<Integer> removedArr = new Stack<>();
        removedArr.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (removedArr.peek() == arr[i])
                continue;
            removedArr.push(arr[i]);
        }
        return removedArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};
        RemovedRepeatedNumbers removedRepeatedNumbers = new RemovedRepeatedNumbers();
        for (int i : removedRepeatedNumbers.solution(arr))
            System.out.print(i + " ");
        System.out.println();
        removedRepeatedNumbers.solution(arr2);
        for (int i : removedRepeatedNumbers.solution(arr2))
            System.out.print(i + " ");
    }
}
