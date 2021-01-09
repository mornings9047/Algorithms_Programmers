package level01;

import java.util.ArrayList;
import java.util.List;

public class MathTest {
    private final int[] solution = {1, 2, 3, 4, 5};
    private final int[] solution2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private final int[] solution3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public List<Integer> solution(int[] answers) {
        List<Integer> counts = new ArrayList<>();
        counts.add(countAnswers(answers, solution));
        counts.add(countAnswers(answers, solution2));
        counts.add(countAnswers(answers, solution3));
        return getHighestPeople(counts);
    }

    public int countAnswers(int[] answers, int[] solution) {
        int answer = 0;
        for (int i = 0; i < answers.length; i++)
            if (answers[i] == solution[i % solution.length])
                answer++;
        return answer;
    }

    public List<Integer> getHighestPeople(List<Integer> list) {
        List<Integer> people = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                people = new ArrayList<>();
                people.add(i + 1);
            } else if (max == list.get(i))
                people.add(i + 1);
        }
        return people;
    }

    public static void main(String[] args) {
        MathTest test = new MathTest();
        int[] answers = {1, 2, 3, 4, 5};
        for (int i : test.solution(answers))
            System.out.print(i + " ");
        System.out.println();

        int[] answers2 = {1, 3, 2, 4, 2};
        for (int i : test.solution(answers2))
            System.out.print(i + " ");
        System.out.println();
    }
}
