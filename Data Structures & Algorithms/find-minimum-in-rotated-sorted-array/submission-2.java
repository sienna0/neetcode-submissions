class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int mid = l + (r-l)/2;
        while (l <= r) {
            if (nums[l] <= nums[mid] && nums[r] > nums[mid]) {
                return nums[l];
            }
            else if (nums[l] <= nums[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
            mid = l + (r-l)/2;
        }
        return nums[mid - 1];
    }
}
