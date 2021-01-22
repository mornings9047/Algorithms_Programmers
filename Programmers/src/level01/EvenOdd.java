package level01;

public class EvenOdd {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num = 3;
        int num2 = 4;

        EvenOdd evenOdd = new EvenOdd();
        System.out.println(evenOdd.solution(num));
        System.out.println(evenOdd.solution(num2));
    }
}