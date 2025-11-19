class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();

        for(int x:nums) set.add(x);
        while(true){
            if(set.contains(original)){
                original *=2;
            }
            else return original;
        }
    }
}