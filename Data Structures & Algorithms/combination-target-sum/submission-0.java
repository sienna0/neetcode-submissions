class Solution {
    public List<List<Integer>> helper(List<List<Integer>> currSolution, int[] nums, int remTarget, 
    List<Integer> currList, int index) {
        for (int i = index; i < nums.length; i++) {
            remTarget -= nums[i];
            currList.add(nums[i]);
            if (remTarget == 0) {
                currSolution.add(new ArrayList<>(currList));
            } else if (remTarget > 0) {
                helper(currSolution, nums, remTarget, currList, i);
            }

            currList.remove(currList.size() - 1);
            remTarget += nums[i];
        }

        return currSolution;
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> solution = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        return helper(solution, nums, target, currList, 0);
    }
}
