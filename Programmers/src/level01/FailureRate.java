package level01;

import java.util.Arrays;

public class FailureRate {
    private int stageCnt;
    private int[] peopleInCurrentStages;
    private int[] remainder;
    private double[] failureRates;

    public int[] solution(int n, int[] stages) {
        stageCnt = n;
        setCurrentStages(stages);
        setRemainder(stages.length);
        setFailureRates();
        double[] sortedRates = sortFailureRate();
        return getSortedIndexes(sortedRates);
    }

    public void setCurrentStages(int[] stages) {
        peopleInCurrentStages = new int[stageCnt];
        for (int s : stages) {
            if (s > stageCnt)
                continue;
            peopleInCurrentStages[s - 1]++;
        }
    }

    public void setRemainder(int peopleCnt) {
        remainder = new int[stageCnt];
        for (int i = 0; i < stageCnt; i++) {
            remainder[i] = peopleCnt;
            peopleCnt -= peopleInCurrentStages[i];
        }
    }

    public void setFailureRates() {
        failureRates = new double[stageCnt];
        for (int i = 0; i < stageCnt; i++) {
            if (remainder[i] == 0)
                continue;
            failureRates[i] = (double) peopleInCurrentStages[i] / remainder[i];
        }
    }

    public double[] sortFailureRate() {
        double[] ascendingRate = new double[stageCnt];
        System.arraycopy(failureRates, 0, ascendingRate, 0, failureRates.length);
        Arrays.sort(ascendingRate);

        double[] sortedRates = new double[stageCnt];
        for (int i = 0; i < ascendingRate.length; i++)
            sortedRates[i] = ascendingRate[ascendingRate.length - 1 - i];
        return sortedRates;
    }

    public int[] getSortedIndexes(double[] sortedRates) {
        int[] sortedIndexes = new int[stageCnt];
        for (int i = 0; i < sortedRates.length; i++) {
            for (int j = 0; j < stageCnt; j++) {
                if (sortedRates[i] == failureRates[j]) {
                    sortedIndexes[i] = j + 1;
                    failureRates[j] = -1;
                    break;
                }
            }
        }
        return sortedIndexes;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int n2 = 4;
        int[] stages2 = {4, 4, 4, 4};
        int n3 = 5;
        int[] stages3 = {1, 1, 1, 1, 1};
        int n4 = 5;
        int[] stages4 = {2, 2, 2, 2, 2};

        FailureRate failureRate = new FailureRate();
        for (int i : failureRate.solution(n, stages))
            System.out.print(i + " ");
        System.out.println();
        for (int i : failureRate.solution(n2, stages2))
            System.out.print(i + " ");
        System.out.println();
        for (int i : failureRate.solution(n3, stages3))
            System.out.print(i + " ");
        System.out.println();
        for (int i : failureRate.solution(n4, stages4))
            System.out.print(i + " ");
    }
}
