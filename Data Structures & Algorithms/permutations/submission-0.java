class Solution {
    public void helper(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> solution) {
        if (curr.size() == nums.length) {
            solution.add(new ArrayList<>(curr));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            
            curr.add(nums[i]);
            used[i] = true;

            helper(nums, used, curr, solution);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        helper(nums, new boolean[nums.length], new ArrayList<>(), solution);
        return solution;
    }
}
