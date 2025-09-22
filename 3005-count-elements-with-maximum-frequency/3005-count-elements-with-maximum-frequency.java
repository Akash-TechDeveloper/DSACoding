class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[] = new int [101];
        int max = 0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            max = Math.max(max,freq[nums[i]]);
        }
        int count = 0;
        for(int i=1;i<101;i++){
            if(max==freq[i])count++;
        }
        return count*max;
    }
}