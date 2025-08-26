class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int [n-k+1];
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!queue.isEmpty() && nums[queue.peekLast()]<nums[i]){
                queue.pollLast();
            }
            queue.addLast(i);
            if(queue.peekFirst() <= i-k){
                queue.pollFirst();
            }
            if(i >= k-1){
                result [i - k + 1] = nums[queue.peekFirst()];
            }
        }
        return result;
    }
}