class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char [][] placed = new char[n][n];
        for(char val[] : placed){
            Arrays.fill(val,'.');
        }
        queens(placed,0);
        return result;
    }
    public void queens (char [][] place, int row){
        if(row==place.length){
            List<String> list = new ArrayList<>();
            for(int i=0;i<place.length;i++){
                list.add(new String (place[i]));
            }
            result.add(list);
            return;
        }
        for(int col=0;col<place[row].length;col++){
            if (isSafe(place , row , col)){
                place[row][col] = 'Q';
                queens(place,row+1);
                place[row][col] = '.';
            }
        }
    }
    public boolean isSafe(char [][] board , int row , int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        int maxleft = Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]=='Q') return false;
        }
        int maxright = Math.min(row,board.length-1-col);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]=='Q') return false;
        }
        return true;
    }
}