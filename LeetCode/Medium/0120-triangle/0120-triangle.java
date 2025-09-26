class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int rows = triangle.size()-1;

        int[] sum =new int[triangle.get(rows).size()+1];

        for(int i = rows;i>=0;i--){
            for(int j = 0;j<=i;j++){
                sum[j] = Math.min(sum[j],sum[j+1])+triangle.get(i).get(j); 
            }
        }


        return sum[0];

    }
}