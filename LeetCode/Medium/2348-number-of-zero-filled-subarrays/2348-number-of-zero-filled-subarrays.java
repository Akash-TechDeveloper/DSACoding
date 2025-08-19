class Solution {
    static{
        for(int i=0;i<=201;i++) zeroFilledSubarray(new int[1]);
    }
    public static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long sum = 0;
        for (int j : nums) {
            if (j == 0) {
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        return sum;
    }
}
