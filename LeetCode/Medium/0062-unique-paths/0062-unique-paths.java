class Solution {
    public int uniquePaths(int m, int n) {
        return (int)nCr(m+n-2,m-1);
    }
   public static long nCr(int n, int r) {
    if (r > n) return 0;
    if (r > n - r) r = n - r;
    
    long result = 1;
    for (int i = 1; i <= r; i++) {
        result = result * (n - r + i) / i;
    }
    return result;
}


}