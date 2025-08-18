class Solution {
         static {
        int[] a = new int[5];
        for (int i = 0; i < 300; i++) {
            numSubarrayProductLessThanK(a, 0);
        }
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
       int n = nums.length;
        int si=0;
        int ei = 0;
        int pd = 1;
        int cnt = 0;
        if(k==0||k==1) return 0;
        while(ei<n){
            pd*=nums[ei];
            while(pd>=k && si<=ei){
                pd/=nums[si];
                si++;
            }
            cnt=cnt+(ei-si+1);
            ei++;
        }
        return cnt;
    }
}