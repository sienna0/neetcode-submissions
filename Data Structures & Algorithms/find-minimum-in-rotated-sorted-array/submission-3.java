class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int mid = l + (r-l)/2;
        while (l < r) {
            mid = l + (r-l)/2;
            if (nums[l] <= nums[mid] && nums[r] > nums[mid]) {
                return nums[l];
            }
            else if (nums[r] < nums[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }
}
