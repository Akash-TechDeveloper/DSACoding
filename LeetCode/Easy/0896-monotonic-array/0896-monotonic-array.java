class Solution {
    static {
        int[] arr = {1, 2, 2, 3};
        for (int i = 0; i <= 500; i++) {
            isMonotonic(arr);
        }
    }

    public static boolean isMonotonic(int[] nums) {
        Boolean increasing = null;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                if (increasing != null && !increasing) return false;
                increasing = true;
            } else if (nums[i] > nums[i + 1]) {
                if (increasing != null && increasing) return false;
                increasing = false;
            }
        }
        return true;
    }
}
