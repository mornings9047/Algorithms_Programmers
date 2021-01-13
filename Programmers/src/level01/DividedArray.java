package level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DividedArray {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> zeroRemainder = new ArrayList<>();
        for (int num : arr)
            if (num % divisor == 0)
                zeroRemainder.add(num);
        Collections.sort(zeroRemainder);

        if (zeroRemainder.isEmpty())
            zeroRemainder.add(-1);
        return zeroRemainder;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3, 2, 6};
        int divisor = 5;
        int divisor2 = 1;
        int divisor3 = 10;

        DividedArray dividedArray = new DividedArray();
        for (int i : dividedArray.solution(arr, divisor))
            System.out.print(i + " ");
        System.out.println();

        for (int i : dividedArray.solution(arr2, divisor2))
            System.out.print(i + " ");
        System.out.println();

        for (int i : dividedArray.solution(arr3, divisor3))
            System.out.print(i + " ");
        System.out.println();
    }
}
