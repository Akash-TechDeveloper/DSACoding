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
    List<List<Integer>> sums = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        path(root,targetSum,0,new ArrayList<>());
        return sums;        
    }
    public void path(TreeNode root,int target,int current,ArrayList<Integer> sum){
        if(root == null) return;
        current += root.val;
        sum.add(root.val);

        if(root.left==null && root.right==null&&current==target){
            sums.add(new ArrayList<>(sum));
         //   return;
        }
        path(root.left,target,current,sum);
        path(root.right,target,current,sum);
        sum.remove(sum.size()-1);
    }
}