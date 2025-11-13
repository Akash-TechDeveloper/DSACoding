class Solution {
    public int maxOperations(String s) {
        int[] prefix = new int[s.length()];

        int n = s.length();
        int intervals = 0;
        boolean inZeroBlock = false;
        int res  = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                if (!inZeroBlock) {
                    intervals++;      
                    inZeroBlock = true;
                }
            } else { 
                inZeroBlock = false;  
            }
            prefix[i] = intervals;

            if(s.charAt(i) == '1') res += prefix[i];
        }
        return res;
    }
}