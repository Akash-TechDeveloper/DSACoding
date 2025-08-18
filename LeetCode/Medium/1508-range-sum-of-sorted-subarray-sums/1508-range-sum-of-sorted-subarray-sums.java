class Solution {
    public int rangeSum(int[] nums, int m, int left, int right) {
        int  n = nums.length; int k=0;
        int arr[]=new int [m*(m+1)/2];
        int prefix [] = new int [n+1];
        for(int j=0;j<n;j++){
            prefix[j]=0;
        for(int i=j;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
            arr[k++]=prefix[i+1];
        }
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=left-1;i<right;i++) sum+=arr[i];
        return sum;
    }
}