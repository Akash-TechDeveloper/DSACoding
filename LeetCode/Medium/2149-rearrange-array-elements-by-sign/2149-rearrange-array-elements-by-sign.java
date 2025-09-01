class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int []result = new int[n];
        int j=0; int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[j]=nums[i];
                j+=2;
            }
            else if(nums[i]<0){
                result[k]=nums[i];
                k+=2;
            }
        }
        return result;
    }
}