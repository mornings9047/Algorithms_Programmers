package level01;

public class CountPpYy {
    public boolean solution(String word) {
        int pCnt = 0, yCnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'p' || word.charAt(i) == 'P')
                pCnt++;
            else if (word.charAt(i) == 'y' || word.charAt(i) == 'Y')
                yCnt++;
        }
        return pCnt == yCnt;
    }

    public static void main(String[] args) {
        String word = "pPooyY";
        String word2 = "Pyy";

        CountPpYy countPpYy = new CountPpYy();
        System.out.println(countPpYy.solution(word));
        System.out.println(countPpYy.solution(word2));
    }
}
