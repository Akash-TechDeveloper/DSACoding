class Solution {
    public int minOperations(int[] nums) {
        int n= nums.length;
        int ones =0;
        int x= 0;
        for(int num : nums){
            if(num==1) ones++;
            x = gcd(x,num);
        }
        if (ones > 0) return n - ones;
        if (x > 1) return -1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int g = nums[i];
            for(int j=i+1;j<n;j++){
                g = gcd(g,nums[j]);
                if(g==1) {
                    ans = Math.min(ans,j-i);
                    break;
                }
            }
        }
        if(ans == Integer.MAX_VALUE)  return -1;
        return ans+n-1;
    }
    private static int gcd(int a , int b){
        if(b==0) return a;
        
        return gcd(b,a%b);
    }
}