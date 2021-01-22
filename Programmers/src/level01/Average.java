package level01;

public class Average {
    public double solution(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return (double) sum / arr.length;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {5, 5};

        Average average = new Average();
        System.out.println(average.solution(arr));
        System.out.println(average.solution(arr2));
    }
}