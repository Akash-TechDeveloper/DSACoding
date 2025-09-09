class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int mod = 1_000_000_007;
        long newP[] = new long [n+1];
        long diff[] = new long [n+2];

        newP[1] = 1;
        if (1 + delay <= n) diff[1 + delay] += 1;
        if (1 + forget <= n) diff[1 + forget] -= 1;

        long shares = 0;

        for(int i = 2;i <= n;i++){
            shares = (shares + diff[i])%mod;
            newP[i] = shares;
            
            if(i+delay<=n){
                diff[i + delay] = (diff[i + delay] + newP[i]) % mod;
            }
            if (i + forget <= n) {
                diff[i + forget] = (diff[i + forget] - newP[i] + mod) % mod;
            }
        }
        long result =0;
         for (int day = n - forget + 1; day <= n; day++) {
            if (day >= 1) {
                result = (result + newP[day]) % mod;
            }
        }
        return (int)result;      
    }
}