package level01;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] suits = new int[n];
        setSuits(suits, lost, reserve);
        borrowSuits(suits);
        return countSuits(suits);
    }

    public void setSuits(int[] suits, int[] lost, int[] reserve) {
        for (int i : lost)
            suits[i - 1]--;
        for (int i : reserve)
            suits[i - 1]++;
    }

    public void borrowSuits(int[] suits) {
        for (int i = 0; i < suits.length; i++) {
            checkFront(suits, i);
            checkBack(suits, i);
        }
    }

    public void checkFront(int[] suits, int index) {
        if (index == 0)
            return;
        if (suits[index] == -1) {
            if (suits[index - 1] == 1) {
                suits[index - 1]--;
                suits[index]++;
            }
        }
    }

    public void checkBack(int[] suits, int index) {
        if (index == suits.length - 1)
            return;
        if (suits[index] == -1) {
            if (suits[index + 1] == 1) {
                suits[index + 1]--;
                suits[index]++;
            }
        }
    }

    public int countSuits(int[] suits) {
        int answer = 0;
        for (int suit : suits)
            if (suit != -1)
                answer++;
        return answer;
    }

    public static void main(String[] args) {
        GymSuit gymSuit = new GymSuit();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(gymSuit.solution(n, lost, reserve));

        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};
        System.out.println(gymSuit.solution(n2, lost2, reserve2));

        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
        System.out.println(gymSuit.solution(n3, lost3, reserve3));
    }
}
