class Solution {
    public static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long sum = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        return sum;
    }
}
