package level01;

public class StrToInt {
    public int solution(String word) {
        int num;
        if (word.charAt(0) == '-')
            num = -addWord(word, 1, word.length());
        else if (word.charAt(0) == '+')
            num = addWord(word, 1, word.length());
        else
            num = addWord(word, 0, word.length());
        return num;
    }

    public int addWord(String word, int start, int end) {
        int num = 0;
        for (int i = start; i < end; i++)
            num += ((word.charAt(i) - '0') * Math.pow(10, word.length() - i - 1));
        return num;
    }

    public static void main(String[] args) {
        String word = "123456789";
        String word2 = "+123456789";
        String word3 = "-123456789";

        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.solution(word));
        System.out.println(strToInt.solution(word2));
        System.out.println(strToInt.solution(word3));
    }
}
