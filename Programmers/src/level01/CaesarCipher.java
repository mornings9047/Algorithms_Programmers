package level01;

public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder encryption = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char oldChar = s.charAt(i);
            if ('a' <= oldChar && oldChar <= 'z') {
                char newChar = (char) (oldChar + n <= 'z' ? oldChar + n : oldChar + n + 'a' - 'z' - 1);
                encryption.append(newChar);
            } else if ('A' <= oldChar && oldChar <= 'Z') {
                char newChar = (char) (oldChar + n <= 'Z' ? oldChar + n : oldChar + n + 'A' - 'Z' - 1);
                encryption.append(newChar);
            } else
                encryption.append(' ');
        }
        return encryption.toString();
    }

    public static void main(String[] args) {
        String s = "AB";
        int n = 1;
        String s2 = "z";
        int n2 = 1;
        String s3 = "a B z";
        int n3 = 4;

        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.solution(s, n));
        System.out.println(caesarCipher.solution(s2, n2));
        System.out.println(caesarCipher.solution(s3, n3));
    }
}