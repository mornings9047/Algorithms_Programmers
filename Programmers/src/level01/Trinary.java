package level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trinary {

    public int solution(int n) {
        List<Integer> trinary = convertNumToTrinary(n);
        return convertTrinaryToDecimal(trinary);
    }

    public List<Integer> convertNumToTrinary(int n) {
        List<Integer> list = new ArrayList<>();
        while (n / 3 != 0) {
            list.add(n % 3);
            n /= 3;
        }
        list.add(n);
        Collections.reverse(list);
        return list;
    }

    public int convertTrinaryToDecimal(List<Integer> trinary) {
        int num = 0;
        for (int i = 0; i < trinary.size(); i++)
            num += Math.pow(3, i) * trinary.get(i);
        return num;
    }

    public static void main(String[] args) {
        Trinary tri = new Trinary();
        int num = 45;
        System.out.println(tri.solution(num));
    }
}