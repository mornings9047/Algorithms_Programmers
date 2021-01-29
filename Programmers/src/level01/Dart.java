package level01;

public class Dart {
    private String dartResult;
    private int[] scores;
    private int scoreIndex;

    public Dart() {
        scores = new int[3];
        scoreIndex = 0;
    }

    public int solution(String dartResult) {
        this.dartResult = dartResult;
        while (scoreIndex != 3)
            calculateScore();
        return sum();
    }

    public void calculateScore() {
        setScore();
        setBonus();
        if (isOptionValid())
            setOption();
        scoreIndex++;
    }

    public void setScore() {
        try {
            scores[scoreIndex] = Integer.parseInt(dartResult.substring(0, 2));
            dartResult = dartResult.substring(2);
        } catch (NumberFormatException e) {
            scores[scoreIndex] = Integer.parseInt(dartResult.substring(0, 1));
            dartResult = dartResult.substring(1);
        }
    }

    public void setBonus() {
        char bonus = dartResult.charAt(0);
        if (bonus == 'D')
            scores[scoreIndex] = (int) Math.pow(scores[scoreIndex], 2);
        else if (bonus == 'T')
            scores[scoreIndex] = (int) Math.pow(scores[scoreIndex], 3);
        dartResult = dartResult.substring(1);
    }

    public boolean isOptionValid() {
        if (dartResult.isEmpty())
            return false;
        char option = dartResult.charAt(0);
        return option == '*' || option == '#';
    }

    public void setOption() {
        char option = dartResult.charAt(0);
        if (option == '*') {
            scores[scoreIndex] *= 2;
            if (scoreIndex != 0)
                scores[scoreIndex - 1] *= 2;
        } else
            scores[scoreIndex] = -scores[scoreIndex];
        dartResult = dartResult.substring(1);
    }

    public int sum() {
        int sum = 0;
        for (int score : scores)
            sum += score;
        return sum;
    }

    public void reset() {
        scores = new int[3];
        scoreIndex = 0;
    }

    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        String dartResult2 = "1D2S#10S";
        String dartResult3 = "1D2S0T";
        String dartResult4 = "1S*2T*3S";
        String dartResult5 = "1D#2S*3S";
        String dartResult6 = "1T2D3D#";
        String dartResult7 = "1D2S3T*";

        Dart dart = new Dart();
        System.out.println(dart.solution(dartResult));
        dart.reset();
        System.out.println(dart.solution(dartResult2));
        dart.reset();
        System.out.println(dart.solution(dartResult3));
        dart.reset();
        System.out.println(dart.solution(dartResult4));
        dart.reset();
        System.out.println(dart.solution(dartResult5));
        dart.reset();
        System.out.println(dart.solution(dartResult6));
        dart.reset();
        System.out.println(dart.solution(dartResult7));
        dart.reset();
    }
}
