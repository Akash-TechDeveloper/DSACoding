class Solution {
    Integer dp[][];
    int n;
    public int minimumTotal(List<List<Integer>> triangle) {
         n = triangle.size();
        dp = new Integer[n][n];
        return solve(0, 0, triangle);
    }
    
    public int solve(int i, int j, List<List<Integer>> triangle) {
        if (i == n - 1) {
            return triangle.get(i).get(j);
        }
        
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        
        int down = solve(i + 1, j, triangle);
        int diagonal = solve(i + 1, j + 1, triangle);
        
        dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagonal);
        
        return dp[i][j];
    }
}