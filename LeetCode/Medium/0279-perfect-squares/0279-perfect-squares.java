class Solution {
    public int numSquares(int n) {
        if(isPerfect(n)) return 1;
        while(n%4==0) n/=4;
        
        if(n%8==7) return 4;
        for(int i=1;i*i<=n;i++){
            if(isPerfect(n-i*i)) return 2;
        }
        return 3;
    }
    public boolean isPerfect(int num) {
        int r = (int) Math.sqrt(num);
        return r*r==num;
    }
}