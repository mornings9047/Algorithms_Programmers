package level01;

public class KeyPad {
    private final int[] xPos = {1, 0, 1, 2, 0, 1, 2, 0, 1, 2};
    private final int[] yPos = {3, 0, 0, 0, 1, 1, 1, 2, 2, 2};
    private StringBuilder hands;
    private int[] leftHand;
    private int[] rightHand;

    private static final int XPOS = 0;
    private static final int YPOS = 1;


    public String solution(int[] numbers, String hand) {
        hands = new StringBuilder();
        leftHand = new int[]{0, 3};
        rightHand = new int[]{2, 3};

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7)
                pressLeft(number);
            else if (number == 3 || number == 6 || number == 9)
                pressRight(number);
            else {
                int distanceBetweenLeftHandAndNumber = calculateDistance(leftHand, number);
                int distanceBetweenRightHandAndNumber = calculateDistance(rightHand, number);

                if (distanceBetweenLeftHandAndNumber < distanceBetweenRightHandAndNumber)
                    pressLeft(number);
                else if (distanceBetweenLeftHandAndNumber > distanceBetweenRightHandAndNumber)
                    pressRight(number);
                else {
                    if (hand.equals("left"))
                        pressLeft(number);
                    else
                        pressRight(number);
                }
            }
        }
        return hands.toString();
    }

    public void pressLeft(int number) {
        leftHand[XPOS] = xPos[number];
        leftHand[YPOS] = yPos[number];
        hands.append("L");
    }

    public void pressRight(int number) {
        rightHand[XPOS] = xPos[number];
        rightHand[YPOS] = yPos[number];
        hands.append("R");
    }

    public int calculateDistance(int[] hand, int number) {
        int xDistance = Math.abs(hand[XPOS] - xPos[number]);
        int yDistance = Math.abs(hand[YPOS] - yPos[number]);
        return xDistance + yDistance;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";

        KeyPad keyPad = new KeyPad();
        System.out.println(keyPad.solution(numbers, hand));
        System.out.println(keyPad.solution(numbers2, hand2));
        System.out.println(keyPad.solution(numbers3, hand3));
    }
}
