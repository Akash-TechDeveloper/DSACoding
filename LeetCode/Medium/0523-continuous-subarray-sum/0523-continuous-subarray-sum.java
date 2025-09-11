class Solution {
    static {
        int arr[] = {0};
        for(int i=0;i<300;i++) checkSubarraySum(arr,1);
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int presum = 0;
    //  int presum [] = new int[n+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
    //      presum[i]=presum[i-1]+nums[i-1];
    //      presum[i]=presum[i]%k;
            presum+=nums[i];
            int remain = presum%k;
            if(remain<0) remain+=k;
    //        System.out.print(presum[i]);
            if(map.containsKey(remain)){
                int index = map.get(remain);
                if(i-index>=2) return true;
            }
            else map.put(remain,i);
        }
        return false;
    }
}