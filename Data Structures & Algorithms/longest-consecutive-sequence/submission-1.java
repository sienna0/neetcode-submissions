class Solution {
    public int longestConsecutive(int[] nums) {
        // max is O(n log n)
        HashSet<Integer> set = new HashSet<>();
        int solution = 0;
        boolean[] start = new boolean[nums.length];

        for (int i : nums) {
            set.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) start[i] = true;
            else start[i] = false;
        }

        for (int i = 0; i < start.length; i++) {
            if (start[i] == true) {
                int streak = 1;
                int curr = nums[i] + 1;
                while (set.contains(curr)) {
                    streak++;
                    curr++;
                }
                if (solution < streak) solution = streak;
            }
        }

        return solution;
    }
}
