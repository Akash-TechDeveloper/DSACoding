class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int first = nums[0];
        int next = Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            int max= Math.max(next,first+nums[i]);
           first = next;
           next=max;
        }
        return next;
    }
}