import java.util.*;
class Solution {
    private boolean isOutsideGrid(int r, int c, int rMax, int cMax) {
        return (r < 0) || (r >= rMax) || (c < 0) || (c >= cMax);
    }

    public int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length, n = grid[0].length, k = queries.length;
        int[] ans = new int[k];
        List<int[]> val2idx = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            val2idx.add(new int[]{queries[i], i});
        }
        Collections.sort(val2idx, (x,y)->x[0]-y[0]);

        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<int[]>pq = new PriorityQueue<>((x,y)->x[0]-y[0]);
        Queue<int[]> trackQ = new LinkedList<>();

        pq.offer(new int[] {grid[0][0], 0, 0});
        visited[0][0] = true;
        for (int[] entry:val2idx) {
            int qval = entry[0], qidx = entry[1];
            while (!pq.isEmpty() && pq.peek()[0] < qval) {
                int[] top = pq.poll();
                trackQ.add(new int[] {top[1], top[2]});
            }

            while (!trackQ.isEmpty()) {
                int[] loc = trackQ.poll();
                count++;
                for (int[] d:dir) {
                    int r = loc[0] + d[0], c = loc[1] + d[1];
                    if (isOutsideGrid(r,c,m,n) || visited[r][c]) continue;
                    visited[r][c] = true;

                    if (grid[r][c] < qval) trackQ.add(new int[] {r,c});
                    else pq.offer(new int[] {grid[r][c], r, c});
                }
            }
            ans[qidx] = count;
        }

        return ans;
    }
}