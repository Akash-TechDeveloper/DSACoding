class Solution {
    public int smallestNumber(int n) {
        for(int i=n;i<n*n;i++){
            if(isPower(i)&& ((i-1)>=n)) return i-1;
        }
        return 1;
    }

    private static boolean isPower(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
