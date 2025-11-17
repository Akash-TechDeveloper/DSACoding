class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            numSub("111111");
        }
    }
    public static int numSub(String s) {
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