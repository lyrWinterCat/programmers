package level_0;

public class SafeArea {
    public int solution(int[][] board) {
        boolean[][] flagBox = new boolean[board.length + 2][board.length + 2];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int k = i; k <= i + 2; k++) {
                        for (int l = j; l <= j + 2; l++) {
                            flagBox[k][l] = true;
                        }
                    }
                }
            }
        }

        int unsafeArea = 0;
        for (int i = 1; i < flagBox.length - 1; i++) {
            for (int j = 1; j < flagBox.length - 1; j++) {
                if (flagBox[i][j]) {
                    unsafeArea++;
                }
            }
        }

        return board.length * board.length - unsafeArea;
    }

    public static void main(String[] args) {
        SafeArea safeArea = new SafeArea();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int solution = safeArea.solution(board);
        System.out.println("solution = " + solution);
    }
}
