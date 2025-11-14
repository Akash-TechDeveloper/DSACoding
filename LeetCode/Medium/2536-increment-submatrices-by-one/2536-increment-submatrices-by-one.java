class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff = new int[n][n];

        for(int[] q : queries){
            int r1 = q[0];
            int c1 = q[1];
            int r2 = q[2];
            int c2 = q[3];

            for(int i = r1; i <= r2; i++){
                diff[i][c1]++;
                if(c2+1 < n){
                    diff[i][c2+1]--;
                }
            }
        }

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += diff[i][j];
                diff[i][j] = sum;
            }
        }

        return diff;
    }
}