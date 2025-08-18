class Solution {
    public int rangeSum(int[] nums, int m, int left, int right) {
        int  n = nums.length; int k=0;
        long arr[]=new long [m*(m+1)/2];
        long prefix [] = new long [n+1];
        for(int j=0;j<n;j++){
            prefix[j]=0;
        for(int i=j;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
            arr[k++]=prefix[i+1];
        }
        }
        int MOD = 1_000_000_007;
        Arrays.sort(arr);
        long sum = 0;
        for (int i = left - 1; i < right; i++) {
            sum = (sum + arr[i]) % MOD;
        }

        return (int) sum;
    }
}