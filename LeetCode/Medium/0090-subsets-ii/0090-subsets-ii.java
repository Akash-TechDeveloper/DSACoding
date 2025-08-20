class Solution {
    List<List<Integer>> set = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,list,0);
        return set;
    }
    public void subset(int [] nums ,List<Integer> list , int index){
        set.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
                list.add(nums[i]);
                subset(nums,list,i+1);
                list.remove(list.size()-1);
        }
    }
}