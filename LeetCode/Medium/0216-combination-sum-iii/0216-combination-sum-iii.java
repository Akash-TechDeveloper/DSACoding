class Solution {
    List<List<Integer>> combined = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        combination(new ArrayList<>(),k,n,1);
        return combined;
    }
    public void combination(ArrayList<Integer> list , int k , int target,int n){
        if(target == 0 && k==0) {
            combined.add(new ArrayList<>(list));
            return ;
        }
        for(int i=n;i<10;i++){
            if(i>target || k<=0) break;
            list.add(i);
            combination(list,k-1,target-i,i+1);
            list.remove(list.size()-1);
        }
    }
}