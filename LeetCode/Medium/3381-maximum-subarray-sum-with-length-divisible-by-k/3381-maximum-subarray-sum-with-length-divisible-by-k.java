class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        prefixSum[0] = 0L;

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        long[] minPrefix = new long[k];
        for (int i = 0; i < k; i++) minPrefix[i] = Long.MAX_VALUE;

        long maxsum = Long.MIN_VALUE;

        for (int i = 0; i <= n; i++) {
            int rem = i % k;
            if (i >= k && minPrefix[rem] != Long.MAX_VALUE) {
                maxsum = Math.max(maxsum, prefixSum[i] - minPrefix[rem]);
            }
            minPrefix[rem] = Math.min(minPrefix[rem], prefixSum[i]);
        }
        long MAX_SAFE = (1L << 53) - 1;
        long MIN_SAFE = -MAX_SAFE;

        return Math.max(MIN_SAFE, Math.min(MAX_SAFE, maxsum));
    }
}
