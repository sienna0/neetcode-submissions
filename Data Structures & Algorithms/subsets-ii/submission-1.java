class Solution {
    public List<List<Integer>> helper(int[] nums, List<Integer> curr, int index) {
        List<List<Integer>> solution = new ArrayList<>();
    
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            curr.add(nums[i]);

            solution.add(new ArrayList<>(curr));
            solution.addAll(helper(nums, curr, i + 1));

            curr.remove(curr.size() - 1);

        }

        return solution;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> solution = helper(nums, new ArrayList<>(), 0);
        solution.add(new ArrayList<>());
        return solution;
    }
}
