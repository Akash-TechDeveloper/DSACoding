class Solution {
    public int largestInteger(int num) {
       char[] nums = String.valueOf(num).toCharArray();
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]<nums[j]&&((nums[j]-nums[i])%2==0)){
                char t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
       }
       return Integer.parseInt(new String(nums));
    }
}