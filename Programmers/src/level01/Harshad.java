package level01;

public class Harshad {
    public boolean solution(int x) {
        int temp = x;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return x % sum == 0;
    }

    public static void main(String[] args) {
        int arr = 10;
        int arr2 = 12;
        int arr3 = 11;
        int arr4 = 13;

        Harshad harshad = new Harshad();
        System.out.println(harshad.solution(arr));
        System.out.println(harshad.solution(arr2));
        System.out.println(harshad.solution(arr3));
        System.out.println(harshad.solution(arr4));
    }

}
