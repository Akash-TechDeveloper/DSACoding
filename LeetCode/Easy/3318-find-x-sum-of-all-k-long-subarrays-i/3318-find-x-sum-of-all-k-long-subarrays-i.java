class Solution {
    LinkedHashMap<Integer, Integer> hm ;
    public int[] findXSum(int[] nums, int k, int x) {
        int[] res = new int[nums.length-k+1];
        
        for(int i =0;i<nums.length-k+1;i++){
            res[i]=x_sum(x,i,k, nums);
        }
        return res;
    }
    public int x_sum(int x,int st, int ed, int[] nums){
        hm = new LinkedHashMap<>();
        for(int i =st; i<ed+st;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]
        );   
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
        }
        int sum = 0;
        int count = 0;
        while (count < x && !pq.isEmpty()) {
            int[] top = pq.poll();
            sum += top[0] * top[1];
            count++;
        }
        
        return sum;
    }
}