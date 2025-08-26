class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int result[]=new int[n-k+1];
        Deque <Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
           while(!q.isEmpty()&&nums[q.peekLast()]<nums[i]){
            q.pollLast();
           }
           q.offerLast(i);

           if(q.peekFirst()==i-k){
            q.pollFirst();
           }
           if(i>=k-1){
             result[i - k + 1] = nums[q.peekFirst()];
           }
        }
        return result;
    }
}