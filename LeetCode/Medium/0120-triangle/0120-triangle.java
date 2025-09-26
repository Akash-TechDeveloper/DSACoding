class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // dp array initialized with -1
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        
        return solve(0, 0, triangle, dp);
    }
    
    private int solve(int i, int j, List<List<Integer>> triangle, int[][] dp) {
        int n = triangle.size();
        
        // Base case: last row → return value at that cell
        if (i == n - 1) {
            return triangle.get(i).get(j);
        }
        
        // If already computed, return stored value
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        // Recursive calls: go down and diagonal
        int down = solve(i + 1, j, triangle, dp);
        int diagonal = solve(i + 1, j + 1, triangle, dp);
        
        // Store result in dp
        dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagonal);
        
        return dp[i][j];
    }
}