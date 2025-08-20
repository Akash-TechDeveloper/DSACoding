class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0,high = 0;
        for(int num : nums){
            low = Math.max(num,low);
            high+=num;
        }
        int ans = high;
        while(low <= high){
            int mid = low+(high-low)/2;
            if (split(mid,nums,k)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public boolean split(int mid , int [] nums,int k ){
        int count = 1;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > mid) {
                count++;
                currentSum = num;
                if (count > k) return false;
            }
        }
        return true;
    }
} 