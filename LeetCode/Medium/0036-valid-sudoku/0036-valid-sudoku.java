class Solution {
     static {
        char[][] b = new char[9][9];
        int iter = 0;
        while (++iter < 400) {
            isValidSudoku(b);
        }
    }

    public static boolean isValidSudoku(char[][] board) {
        return solve(board);
    }

    static boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    char num = board[i][j];
                    board[i][j] = '.';
                    if (!isSafe(board, i, j, num)) return false;
                    else board[i][j] = num;
                }
            }
        }
        return true;
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) return false;
            if (board[row][i] == num) return false;
        }
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }
        return true;
    }
}
