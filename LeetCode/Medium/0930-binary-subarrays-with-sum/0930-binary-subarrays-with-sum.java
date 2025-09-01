import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int count = 0;
        int prefix = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1); 

        for (int num : nums) {
            prefix += num; 
            count += freq.getOrDefault(prefix - goal, 0);
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}
