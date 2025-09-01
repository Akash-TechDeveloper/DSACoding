import java.util.*;
class Solution {
    static {
        int[] testInput = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        for (int i = 0; i < 300; i++) {
            shortestSubarray(testInput, k);
        }
    }
    public static int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long arr[]=new long [n+1];
        for(int i=0;i<n;i++){
            arr[i+1]=arr[i]+nums[i];
        }
        Deque <Integer> q = new ArrayDeque<>();
        int result=n+1;
        for(int i=0;i<=n;i++){
            while(!q.isEmpty()&&arr[i]-arr[q.peekFirst()]>=k){
                result=Math.min(result,i-q.pollFirst());
            }
            while(!q.isEmpty()&&arr[i]<=arr[q.peekLast()]){
                q.pollLast();
            }
            q.addLast(i);
        }
        return result<=n ? result:-1 ;
    }
}