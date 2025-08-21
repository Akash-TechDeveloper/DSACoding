class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> window = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long current = (long) nums[i];           
            Long ceil = window.ceiling(current - valueDiff);
            if (ceil != null && Math.abs(ceil - current) <= valueDiff) {
                return true;
            }
            window.add(current);
            if (i >= indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}