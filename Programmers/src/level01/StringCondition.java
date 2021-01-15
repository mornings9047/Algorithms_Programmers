package level01;

public class StringCondition {
    public boolean checkString(String word) {
        int length = word.length();
        if (length != 4 && length != 6)
            return false;
        try {
            Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "a234";
        String word2 = "1234";

        StringCondition stringCondition = new StringCondition();
        System.out.println(stringCondition.checkString(word));
        System.out.println(stringCondition.checkString(word2));
    }
}