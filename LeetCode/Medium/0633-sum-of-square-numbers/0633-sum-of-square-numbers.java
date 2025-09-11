class Solution {
    public boolean judgeSquareSum(int c) {
        int st=0;
        long end = (long)Math.sqrt(c);
        while(st<=end){
            long sum = st*st+end*end;
            if(sum==c) return true;
            else if (sum<c) st++;
            else if(sum>c) end--;
        }
        return false;
    }
}