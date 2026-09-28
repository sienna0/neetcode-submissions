class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = 0;
        while (true) {
            j++;
            for (int i = 0; i < nums.length - j; i++) {
                if (nums[i] + nums[i + j] == target) return new int[]{i, i+j};
            }
        }
    }
}
