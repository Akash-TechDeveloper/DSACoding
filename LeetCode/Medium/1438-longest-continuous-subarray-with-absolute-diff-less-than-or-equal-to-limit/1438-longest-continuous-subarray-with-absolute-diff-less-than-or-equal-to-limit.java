class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> q1 = new ArrayDeque<>();
        Deque<Integer> q2 = new ArrayDeque<>();
        int i = 0;
        int  j=0;
        for(j=0;j<nums.length;j++){
            while(!q1.isEmpty() && nums[j] > q1.peekLast()) q1.pollLast();
            while(!q2.isEmpty() && nums[j] < q2.peekLast()) q2.pollLast();
            q1.add(nums[j]);
            q2.add(nums[j]);

            if(q1.peek()-q2.peek()>limit){
                if(q1.peek()==nums[i]) q1.poll();
                if(q2.peek()==nums[i]) q2.poll();
                ++i;
            }
        }
        return j-i;
    }
}