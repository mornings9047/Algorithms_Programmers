package level01;

public class CenterCharacter {
    public String solution(String word) {
        int length = word.length();
        if (length == 0)
            return "";
        int startIndex = (length % 2 == 0 ? length / 2 - 1 : length / 2);
        int endIndex = length / 2 + 1;
        return word.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String s2 = "qwer";
        CenterCharacter centerCharacter = new CenterCharacter();
        System.out.println(centerCharacter.solution(s));
        System.out.println(centerCharacter.solution(s2));
    }
}
