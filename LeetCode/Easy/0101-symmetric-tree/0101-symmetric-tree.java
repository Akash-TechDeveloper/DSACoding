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
    public boolean isSymmetric(TreeNode root) {
        return issy(root,root);
    }
    public boolean issy(TreeNode leftt,TreeNode rightt){
        if(leftt==null && rightt==null) return true;
        if(leftt==null || rightt==null) return false;
        return leftt.val == rightt.val && issy(leftt.left,rightt.right) && issy(leftt.right,rightt.left);

    }
}