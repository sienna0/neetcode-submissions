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
    public List<Integer> helper (TreeNode root, HashSet<Integer> heights, Integer currHeight, List<Integer> curr) {
        if (root == null) return curr;

        if (!heights.contains(currHeight)) {
            heights.add(currHeight);
            curr.add(root.val);
        }

        curr = helper(root.right, heights, currHeight + 1, curr);
        curr = helper(root.left, heights, currHeight + 1, curr);

        return curr;

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> solution = new ArrayList<>();
        HashSet<Integer> heights = new HashSet<>();
        return helper(root, heights, 0, solution);
        
    }
}
