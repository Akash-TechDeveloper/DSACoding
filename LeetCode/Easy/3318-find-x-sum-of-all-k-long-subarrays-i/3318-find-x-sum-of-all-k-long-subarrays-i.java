class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        Map<Integer,Integer> map = new HashMap<>();
        //ArrayList<Integer> list = new ArrayList<>();
        int result[] = new int [nums.length-k+1];
        int i=0;
        int y=0;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while (i<j && (j - i + 1) > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }

            if (j - i + 1 == k) {
                result[y++] = helperSum(map, x);
            }
        }
        return result;
    }
    private static int helperSum(Map<Integer,Integer> map , int x){
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> b[0] != a[0] ? b[0] - a[0] : b[1] - a[1]);
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            q.offer(new int[]{mp.getValue(),mp.getKey()});
        }
        int sum = 0;
        while ( x-->0 && !q.isEmpty()) {
            int[] top = q.poll();
            sum += top[0] * top[1];
        }
        return sum;
    }
}