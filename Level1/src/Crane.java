import java.util.Stack;

// 크레인 인형뽑기 게임 (level1)

public class Crane {
    private Stack<Integer> stack;       // stack 생성

    public int solution(int[][] board, int[] moves) {
        stack = new Stack<>();
        int answer = 0;
        for (int move : moves) {        // moves에 있는 값을 가져온다
            int doll = getDoll(board, move - 1);        // board에서 doll의 값을 구한다
            answer += push(doll);   // 경우에 맞춰서 push한다
        }
        return answer;
    }

    public int getDoll(int[][] board, int move) {
        int doll = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][move] != 0) {      // board의 맨 위부터 하나씩 0인지 확인한다
                doll = board[i][move];      // 0이 아니면 doll에 값을 저장한다
                board[i][move] = 0;         // doll에 값을 저장했으니 해당 자리는 비어있다
                break;
            }
        }
        return doll;
    }

    public int push(int doll) {
        if (doll == 0)                       // 0은 board의 n번째 줄이 비어있다는 의미이다
            return 0;
        if (!stack.isEmpty()) {
            if (stack.peek() == doll) {     // doll의 값이 peek()와 같다면 인형이 같다는 의미이다
                                            // pop을 해주고 인형 2개가 사라졌으므로 2를 리턴한다
                stack.pop();
                return 2;
            }
        }
        stack.push(doll);                   // stack에 doll을 저장한다
        return 0;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        Crane crane = new Crane();
        System.out.println(crane.solution(board, moves));
    }
}
