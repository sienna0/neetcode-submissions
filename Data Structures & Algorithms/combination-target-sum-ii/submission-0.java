class Solution {
    public List<List<Integer>> helper (int[] candidates, int target, int index, 
        List<List<Integer>> solution, List<Integer> currList) {
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;

            currList.add(candidates[i]);

            if (target - candidates[i] == 0) {
                solution.add(new ArrayList<>(currList));
            } else if (target - candidates[i] > 0) {
                helper(candidates, target - candidates[i], i + 1, solution, currList);
            }

            currList.remove(currList.size() - 1);
        }
        return solution;

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> solution = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> currList = new ArrayList<>();
        
        return helper(candidates, target, 0, solution, currList);
    }
}
