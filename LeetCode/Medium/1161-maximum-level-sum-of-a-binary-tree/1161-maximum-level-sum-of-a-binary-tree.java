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
    public int maxLevelSum(TreeNode root) {
        Deque<TreeNode>  q = new ArrayDeque<>();
        int max = 0;
        int lvl = 0;
        int result = 0;
        if(root==null) return root.val;
        q.offer(root);
       while (!q.isEmpty()) {
            int levelSize = q.size();
            int sum =0; lvl++;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                sum +=node.val;
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            if(max<sum) {
                max = sum;
                result = lvl;
            }
        }
        return result;
    }
}