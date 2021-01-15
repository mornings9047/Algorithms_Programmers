package level01;

import java.util.Arrays;

public class KimInSeoul {
    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        KimInSeoul kimInSeoul = new KimInSeoul();
        System.out.println(kimInSeoul.solution(seoul));
    }
}