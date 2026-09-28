class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productNoZero = 1;
        int numZeros = 0;
        for (int i : nums) {
            if (i != 0) productNoZero *= i;
            else numZeros++;
        }

        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (numZeros > 1) newNums[i] = 0;
            else if (numZeros == 1) {
                if (nums[i] == 0) newNums[i] = productNoZero;
                else newNums[i] = 0;
            } 
            else {
                newNums[i] = productNoZero / nums[i];
            }
        }

        return newNums;
    }
}  
