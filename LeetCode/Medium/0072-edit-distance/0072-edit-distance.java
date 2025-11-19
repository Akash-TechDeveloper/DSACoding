class Solution {
    public int minDistance(String word1, String word2) {
        int x = word1.length();int y = word2.length();
        int dp[][] = new int [x][y];
        for(int q[] : dp) Arrays.fill(q,-1);
        return mins(dp,word1,word2,x-1,y-1);
    }
    public static int mins( int dp[][],String w1, String w2, int i, int j){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(w1.charAt(i) == w2.charAt(j)) return dp[i][j] =mins(dp,w1,w2,i-1,j-1);
        return dp[i][j] = 1 + Math.min(mins(dp,w1,w2,i-1,j),Math.min(mins(dp,w1,w2,i,j-1),mins(dp,w1,w2,i-1,j-1)));
    }
}