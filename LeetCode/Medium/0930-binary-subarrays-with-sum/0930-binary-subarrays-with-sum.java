class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int [] presum = new int [n+1];
        for(int i=1;i<=n;i++){
            presum[i]=presum[i-1]+nums[i-1];
        }
         int count = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        for (int i = 1; i <= n; i++) {
            int curr = presum[i];
            count += freq.getOrDefault(curr - goal, 0);
            freq.put(curr, freq.getOrDefault(curr, 0) + 1);
        }
        return count;
    }
}