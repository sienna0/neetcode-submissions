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
    // curr being the current node we're finding the diameter of
    int sol;
    public int diameter(TreeNode curr) {
        if (curr == null) return 0;
        int left = diameter(curr.left);
        int right = diameter(curr.right);

        if (left + right > sol) sol = left + right;

        return (1 + Math.max(left, right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        sol = 0;
        diameter(root);
        return sol;
    }
}
