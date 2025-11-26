class Solution {
    private int n, m, k;
    private static final int MOD = 1_000_000_007;

    public int numberOfPaths(int[][] grid, int k) {
        this.n = grid.length;
        this.m = grid[0].length;
        this.k = k;

        int[][][] dp = new int[n][m][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return dfs(grid, dp, 0, 0, grid[0][0] % k);
    }

    private int dfs(int[][] grid, int[][][] dp, int r, int c, int mod) {

        if (r == n - 1 && c == m - 1) return mod == 0 ? 1 : 0;
        int memo = dp[r][c][mod];
        if (memo != -1) return memo;
        long res = 0;

        if (r + 1 < n) {
            int nextMod = mod + grid[r + 1][c];
            if (nextMod >= k) nextMod %= k;
            res += dfs(grid, dp, r + 1, c, nextMod);
            if (res >= MOD) res %= MOD;
        }

        if (c + 1 < m) {
            int nextMod = mod + grid[r][c + 1];
            if (nextMod >= k) nextMod %= k;
            res += dfs(grid, dp, r, c + 1, nextMod);
            if (res >= MOD) res %= MOD;
        }
        return dp[r][c][mod] = (int) res;
    }
}
