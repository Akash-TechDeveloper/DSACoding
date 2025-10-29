class Solution {
    public int smallestNumber(int n) {
        
        for(int i=n;i<n*n;i++){
            if(isPower(i)&& ((i-1)>=n)) return i-1;
        }
        return 1;
    }
    private static boolean isPower(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}