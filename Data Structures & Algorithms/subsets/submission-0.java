class Solution {
    public List<List<Integer>> helper(int[] nums, List<Integer> curr, int index) {
        List<List<Integer>> solution = new ArrayList<>();
    
        for (int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            solution.add(new ArrayList<>(curr));
            solution.addAll(helper(nums, curr, i + 1));

            curr.remove(curr.size() - 1);

        }

        return solution;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> solution = helper(nums, new ArrayList<>(), 0);
        solution.add(new ArrayList<>());
        return solution;
    }
}
