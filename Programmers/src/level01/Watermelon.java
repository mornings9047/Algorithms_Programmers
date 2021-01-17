package level01;

import java.util.ArrayList;
import java.util.List;

public class Watermelon {
    public String solution(int n) {
        List<Integer> reversedBin = intToBin(n);
        return appendWatermelon(reversedBin);
    }

    public List<Integer> intToBin(int n) {
        List<Integer> bin = new ArrayList<>();
        while (n > 0) {
            bin.add(n % 2);
            n /= 2;
        }
        return bin;
    }

    public String appendWatermelon(List<Integer> reversedBin) {
        StringBuilder answer = new StringBuilder();
        StringBuilder watermelon = new StringBuilder("수박");

        for (int i = 1; i < reversedBin.size(); i++) {
            if (reversedBin.get(i) == 1)
                answer.append(watermelon);
            watermelon.append(watermelon);
        }

        if (reversedBin.get(0) == 1)
            answer.append("수");
        return answer.toString();
    }

    public static void main(String[] args) {
        int n = 3;
        int n2 = 4;

        Watermelon watermelon = new Watermelon();
        System.out.println(watermelon.solution(n));
        System.out.println(watermelon.solution(n2));
    }
}
