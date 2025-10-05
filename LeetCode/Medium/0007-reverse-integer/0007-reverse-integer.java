class Solution {
    public int reverse(int x) {
        //if(x<0) {x= -1*x;
        long rev = 0;
        while(x!=0){
            rev = (x%10)+ rev*10;
            x/=10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        return (int) rev;
    }
}
