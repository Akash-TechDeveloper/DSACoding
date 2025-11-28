class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++) list.add(new ArrayList<>());
        for(int x[]:edges){
            list.get(x[0]).add(x[1]);
            list.get(x[1]).add(x[0]);
        }
        int[] res = new int [1];
        dfs(list,values,0,-1,res,k);
        return res[0];
    }
    static int dfs(List<List<Integer>> adj, int[] values, int node, int parent, int[] ans, int k) {
        int sum = values[node];
        for(int temp : adj.get(node)) {
            if(temp != parent) {
                sum += dfs(adj,values,temp,node,ans,k);
            }
        }
        if(sum % k == 0) ans[0]++;
        return sum % k;
    }
}