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
    public int dfs(TreeNode curr, int currentMax) {
        if (curr == null) return 0;
        int solution = 0;
        // curr 
        if (curr.val >= currentMax) {
            solution++;
            currentMax = curr.val;
        }

        // left
        solution += dfs(curr.left, currentMax);
        // right
        solution += dfs(curr.right, currentMax);

        return solution;
    }
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        
        return dfs(root, -101);
    }
}
