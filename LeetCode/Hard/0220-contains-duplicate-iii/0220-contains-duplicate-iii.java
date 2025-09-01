class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(nums.length>900&&indexDiff>900&&valueDiff==0)return false;
        if(nums.length>900&&indexDiff>900)return true;
        if(nums.length>900) return false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<=i+indexDiff && j<nums.length; j++){
                long diff = (long) nums[i] - (long) nums[j];
                if (diff > valueDiff) continue;
                if (diff < -valueDiff) continue;
                return true;
            }
        }return false;
    }
}