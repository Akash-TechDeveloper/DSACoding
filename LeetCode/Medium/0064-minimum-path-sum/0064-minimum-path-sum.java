class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        return minPath(grid,dp,n-1,m-1);
    }
    public int minPath(int [][]grid,int[][]dp,int row,int col){
        if(row==0&&col==0) return grid[row][col];
        if(dp[row][col]!=-1) return dp[row][col];
        else if(row==0) dp[row][col] = grid[row][col] + minPath(grid,dp,row,col-1);
        else if(col==0) dp[row][col] = grid[row][col] + minPath(grid,dp,row-1,col);
        else dp[row][col]=grid[row][col]+Math.min(minPath(grid,dp,row,col- 1),minPath(grid,dp,row-1,col));
        return dp[row][col];
    }
}