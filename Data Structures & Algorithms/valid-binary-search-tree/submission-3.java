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
    public boolean dfs(TreeNode curr, int min, int max) {
        if (curr == null) return true;
        if (curr.val < min || curr.val > max) return false;

        return (dfs(curr.right, curr.val + 1, max) && dfs(curr.left, min,  curr.val - 1));

    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root, -1001, 1001);
    }
}
