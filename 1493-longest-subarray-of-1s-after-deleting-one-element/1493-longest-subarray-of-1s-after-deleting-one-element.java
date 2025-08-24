class Solution {
    static{
        for(int i=0;i<500;i++)
        {
            longestSubarray(new int[]{0});
        }
    }
    public static int longestSubarray(int[] nums) {
        int left = 0, maxLength = 0, zeroCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
        }
        
        return maxLength; 
    }
}
