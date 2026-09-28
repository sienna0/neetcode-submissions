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
    // inorder traversal to find kth smallest integer
    // recursive function, where through every iteration, the function 
    // does an inorder traversal of the current node

    // the beginning of each function run, kLeft will be
    // the number of smallest nodes left before the
    // kth smallest node
    int kLeft;
    public int helper(TreeNode curr) {
        // base case
        if (curr == null) return -1;
        
        int left = helper(curr.left);
        if (left > 0) return left;
        kLeft--;
        if (kLeft == 0) return curr.val;
        int right = helper(curr.right);
        if (right > 0) return right;

        return -1;
            
    }
    public int kthSmallest(TreeNode root, int k) {
        kLeft = k;

        return helper(root);
        
    }
}
