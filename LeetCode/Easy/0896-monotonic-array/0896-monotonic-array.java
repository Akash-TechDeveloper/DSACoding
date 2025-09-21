class Solution {
    static{
        int[] arr = {1,2,2,3};
        for(int i = 0; i <= 500; i++){
            isMonotonic(arr);
        }
    }
    public static boolean isMonotonic(int[] nums) {
        boolean in = false;
        boolean de = false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) in = true;
            else if(nums[i]>nums[i+1]) de = true;

            if(in&&de) return false;
        }
        return true;
    }
}