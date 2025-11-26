class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int x[] : grid) Arrays.sort(x);
        int res = 0;
        for(int i=0;i<grid[0].length;i++){
            int max = 0;
            for(int j=0;j<grid.length;j++){
                if(max<grid[j][i])  max = grid[j][i];
            }
            res +=max;
        }
        return res;
    }
}