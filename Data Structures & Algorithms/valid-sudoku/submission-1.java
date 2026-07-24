class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (!isValid(i, j, board.length, board))
                    return false;
            }
        }

        return true;
    }

    public boolean isValid(int i, int j, int n, char[][] board) {

        if (board[i][j] == '.')
            return true;

        for (int k = 0; k < n; k++) {

            if (k != j && board[i][j] == board[i][k])
                return false;

            if (k != i && board[i][j] == board[k][j])
                return false;
        }

        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;

        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {

                if (r == i && c == j)
                    continue;

                if (board[r][c] == board[i][j])
                    return false;
            }
        }

        return true;
    }
}