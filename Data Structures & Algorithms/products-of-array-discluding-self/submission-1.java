class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightProduct = new int[nums.length];
        int[] leftProduct = new int[nums.length];

        rightProduct[nums.length - 1] = 1;
        leftProduct[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = nums[i - 1] * leftProduct[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

        int[] solution = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            solution[i] = leftProduct[i] * rightProduct[i];
        }

        return solution;
    }
}  
