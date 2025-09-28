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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>  q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        if(root==null) return result;
        q.offer(root);
        boolean odd = true;
       while (!q.isEmpty()) {
            int levelSize = q.size();
            level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                if(odd) level.add(node.val);
                else level.add(0,node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            result.add(level);
            odd=!odd;
        }

        return result;
    }
}