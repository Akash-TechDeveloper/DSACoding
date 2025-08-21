class Solution {
    public int totalNQueens(int n) {
        char [][] board = new char[n][n];
        for(char[] bard : board){
            Arrays.fill(bard,'.');
        }
        return arrange (board,0);
    }
    public int arrange(char [][] board,int row){
        if(row==board.length) {
            return 1;
        }
        int count=0;
        for(int col=0;col<board[row].length;col++){
            if(isSafe(board,row,col)) {
                board[row][col]='Q';
                count+=(arrange(board,row+1));
                board[row][col]='.';
            }
        }
        return count;
    }
    public boolean isSafe(char [][] board ,int row , int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]=='Q') return false;
        }
        int maxRight = Math.min(row,board.length-1-col);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]=='Q') return false;
        }
        return true;
    }
}