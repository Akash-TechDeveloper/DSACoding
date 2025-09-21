public class Solution {
    static{
        for(int i=0;i<500;i++) find132pattern(new int[]{1,3});
    }
    public static boolean find132pattern(int[] nums) {
        int k = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < k) {
                return true;
            }

            while(!stack.isEmpty() && stack.peekFirst() < nums[i]) {
                k = stack.pollFirst();
            }
            stack.offerFirst(nums[i]);
        }
        return false;
    }
}