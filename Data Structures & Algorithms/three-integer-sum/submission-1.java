class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        HashSet<List<Integer>> solution = new HashSet<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int rem = 0 - nums[i];
            map.put(nums[i], map.get(nums[i]) - 1);

            for (int j = i + 1; j < nums.length; j++) {
                int last = rem - nums[j];
                if (map.getOrDefault(last, 0) == 0 || (map.getOrDefault(last, 0) == 1 && nums[j] == last)) continue;
                else {
                    List<Integer> curr = new ArrayList<>(List.of(nums[i], nums[j], last));
                    Collections.sort(curr);
                    solution.add(curr);
                }
            }
        }

        return new ArrayList<>(solution);
    }
}
