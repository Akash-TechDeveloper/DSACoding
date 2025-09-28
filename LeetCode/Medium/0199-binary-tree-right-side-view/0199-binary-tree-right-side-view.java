/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(0,root,list);
        return list;
    }
    public void dfs(int depth, TreeNode root, List<Integer> list){
        if(root == null) return;

        if(depth == list.size()){
            list.add(root.val);
        }
        dfs(depth+1,root.right,list);
        dfs(depth+1,root.left,list);
    }
}