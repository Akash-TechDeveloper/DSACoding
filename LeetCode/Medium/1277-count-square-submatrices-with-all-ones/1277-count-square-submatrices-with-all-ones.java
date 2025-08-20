class Solution {
    public int countSquares(int[][] matrix) {
        int row = matrix.length;
        if(row==0) return 0;
        int col = matrix[0].length;
        int dp[][] = new int [row+1][col+1];
        int count = 0;

        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                if(matrix[i-1][j-1] == 1){
                    dp[i][j]= 1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                    count+=dp[i][j];
                }
            }
        }
        return count;
    }
}