class Solution {
    public int numSub(String s) {
         final int mod = 1000_000_007;
        int count = 0;
        int ans = 0;
        for(char c : s.toCharArray()){
            if(c == '1') {
                count++;
                ans=(ans+count) % mod;
            }
            else count = 0;
        }
        return (int)ans;
    }
}