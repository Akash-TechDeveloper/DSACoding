class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(',');
            }
            String rowKey = sb.toString();
            map.put(rowKey, map.getOrDefault(rowKey, 0) + 1);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[j][i]).append(',');
            }
            String colKey = sb.toString();
            ans += map.getOrDefault(colKey, 0);
        }

        return ans;
    }
}
