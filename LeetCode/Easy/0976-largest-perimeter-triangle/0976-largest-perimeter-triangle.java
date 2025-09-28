class Solution {
    static {
        int arr[] = {1,2,3};
        for (int i = 0; i < 500; i++) {
            largestPerimeter(arr);
        }
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>1;i--){
            if(nums[i]<(nums[i-1]+nums[i-2])){
               return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}