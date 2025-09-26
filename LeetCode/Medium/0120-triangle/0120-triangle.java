class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.isEmpty()||triangle == null)  return 0;
        
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int curr =triangle.get(i).get(j);
                int left  = triangle.get(i+1).get(j);
                int right = triangle.get(i+1).get(j+1);
                int min = Math.min(left,right);
                triangle.get(i).set(j,curr+min);
            }
        }
        return triangle.get(0).get(0);
    }
}