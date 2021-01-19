package level01;

public class WeirdString {
    public String solution(String word) {
        StringBuilder weird = new StringBuilder();
        String upperWord = word.toUpperCase();
        String lowerWord = word.toLowerCase();

        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                index = 0;
                weird.append(" ");
            } else if (index++ % 2 == 0)
                weird.append(upperWord.charAt(i));
            else
                weird.append(lowerWord.charAt(i));
        }
        return weird.toString();
    }

    public static void main(String[] args) {
        String s = "try    hello world";
        String s2 = "NOSPACE";

        WeirdString weirdString = new WeirdString();
        System.out.println(weirdString.solution(s));
        System.out.println(weirdString.solution(s2));
    }
}
