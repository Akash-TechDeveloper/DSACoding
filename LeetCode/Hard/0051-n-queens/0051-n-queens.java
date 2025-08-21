class Solution {
    List<List<String>> queens = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(char[] bard : board){
            Arrays.fill(bard,'.');
        }
        arrange (board,0);
        return queens;
    }
    public void arrange(char [][] board,int row){
        if(row==board.length) {
            List<String> qin = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                qin.add(new String(board[i]));
            }
            queens.add(qin);
            return;
        }
        for(int col=0;col<board[row].length;col++){
            if(isSafe(board,row,col)) {
                board[row][col]='Q';
                arrange(board,row+1);
                board[row][col]='.';
            }
        }    
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