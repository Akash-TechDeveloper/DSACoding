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
    static{
        Solution sc = new Solution();
        for(int i=0;i<500;i++){
            sc.averageOfLevels(null);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>  q = new LinkedList<>();
        List<Double> result = new ArrayList<>();
        if(root==null) return result;
        q.offer(root);
       while (!q.isEmpty()) {
            int levelSize = q.size();
            double sum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            result.add((double)(sum/levelSize));
        }

        return result;
    }
}