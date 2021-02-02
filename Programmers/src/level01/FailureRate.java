package level01;

import java.util.Arrays;

public class FailureRate {
    private int stageCnt;
    private int[] currentStages;
    private int[] remainder;
    private long[] failureRates;

    public int[] solution(int n, int[] stages) {
        stageCnt = n;
        setCurrentStages(stageCnt, stages);
        setRemainder(stages.length);
        int peopleCnt = stages.length;
        setFailureRate(peopleCnt);
        double[] sortedRates = sortFailureRate();
        return getSortedIndexes(sortedRates);
    }

    public void setCurrentStages(int n, int[] stages) {
        currentStages = new int[n];
        for (int s : stages) {
            if (s > n)
                continue;
            currentStages[s - 1]++;
        }

        System.out.print("currentStages: ");
        for (int i : currentStages)
            System.out.print(i + " ");
        System.out.println();
    }

    public void setRemainder(int peopleCnt) {
        remainder = new int[stageCnt];
        for (int i = 0; i < stageCnt; i++) {
            remainder[i] = peopleCnt;
            peopleCnt -= currentStages[i];
        }

        System.out.print("remainder: ");
        for (int i : remainder)
            System.out.print(i + " ");
        System.out.println();
    }

    public void setFailureRate(int peopleCnt) {
        failureRates = new long[stageCnt];

        for (int i = 0; i < stageCnt; i++) {
            remainder[i] = peopleCnt;
            peopleCnt -= currentStages[i];
        }
        long commonProduct = multiplyAll(remainder);

        for (int i = 0; i < stageCnt; i++)
            failureRates[i] = currentStages[i] * commonProduct / remainder[i];
    }

    public long multiplyAll(int[] remainder) {
        long commonProduct = 1;
        for (int i : remainder)
            commonProduct *= i;
        return commonProduct;
    }

    public double[] sortFailureRate() {
        long[] ascendingRate = new long[stageCnt];
        System.arraycopy(failureRates, 0, ascendingRate, 0, failureRates.length);
        Arrays.sort(ascendingRate);

        double[] descendingRate = new double[stageCnt];
        for (int i = 0; i < ascendingRate.length; i++)
            descendingRate[i] = ascendingRate[ascendingRate.length - 1 - i];
        return descendingRate;
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

        FailureRate failureRate = new FailureRate();
        for (int i : failureRate.solution(n, stages))
            System.out.print(i + " ");
        System.out.println();
        for (int i : failureRate.solution(n2, stages2))
            System.out.print(i + " ");
    }
}
