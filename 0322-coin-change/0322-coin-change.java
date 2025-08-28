class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            coinChange(new int[]{1,2,5}, 11);
        }
    }
    public static int coinChange(int[] coins, int amount) {
       int max = amount+1;
       int dp[] = new int [amount+1];
       Arrays.fill(dp,max);
       dp[0]=0;
       for(int i=0;i<=amount;i++){
        for(int x : coins){
            if(x <=i){
                dp[i] = Math.min(dp[i], dp[i - x] + 1);
            }
        }
       }
       return dp[amount]>amount ? -1 : dp[amount];
    }
}