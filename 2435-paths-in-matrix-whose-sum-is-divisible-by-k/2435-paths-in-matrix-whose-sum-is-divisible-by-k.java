class Solution {
    int n, m;
    static final int MOD = 1_000_000_007;

    public int numberOfPaths(int[][] grid, int k) {
        n = grid.length;  m = grid[0].length;
        int[][][] dp = new int[n][m][k];
        for (int[][] row : dp) for (int[] mod : row) Arrays.fill(mod, -1);

        return paths(dp, grid, 0, 0, grid[0][0] % k, k);
    }

    private int paths(int[][][] dp, int[][] grid, int r, int c, int mod, int k) {

        if (r == n - 1 && c == m - 1) return mod == 0 ? 1 : 0;
        if (dp[r][c][mod] != -1) return dp[r][c][mod];

        long res = 0;

        if (r +1< n) res = (res + paths(dp, grid, r + 1, c, (mod + grid[r + 1][c]) % k, k)) % MOD;
        if (c + 1 < m) res = (res + paths(dp, grid, r, c + 1, (mod + grid[r][c + 1]) % k, k)) % MOD;

        return dp[r][c][mod] = (int) res;
    }
}
