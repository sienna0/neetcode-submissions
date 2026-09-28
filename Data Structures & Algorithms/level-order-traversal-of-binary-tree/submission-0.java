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
    public List<List<Integer>> helper(TreeNode root, List<List<Integer>> curr, int currHeight) {
        if (root == null) return curr;

        if (curr.size() <= currHeight) {
            List<Integer> newHeight = new ArrayList<>();
            newHeight.add(root.val);
            curr.add(newHeight);
        } else {
            curr.get(currHeight).add(root.val);
        }

        curr = helper(root.left, curr, currHeight + 1);
        curr = helper(root.right, curr, currHeight + 1);
        
        return curr;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> solution = new ArrayList<>();
        return helper(root, solution, 0);

        
    }
}
