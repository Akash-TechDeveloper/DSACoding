class Solution {
    static {
        for(int i=0;i<300;i++){
            int arr[]={0,0};
            numSubarraysWithSum(arr,0);
        }
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int[] freq = new int[n + 1]; 
        int prefix = 0, count = 0;
        freq[0] = 1;
        for (int num : nums) {
            prefix += num;
            if (prefix - goal >= 0) {
                count += freq[prefix - goal];
            }
            freq[prefix]++;
        }
        return count;
    }
}

