class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = l + (r - l)/2;
        while (l <= r) {
            if (target == nums[mid]) return mid;
            
            if (nums[l] <= nums[mid]) {
                if (target == nums[l]) return l;

                if (target < nums[mid] && target >= nums[l]) r = mid - 1;
                else l = mid + 1;
            } else {
                if (target == nums[r]) return r;

                if (target > nums[mid] && target <= nums[r]) l = mid + 1;
                else r = mid - 1;
            }
            mid = l + (r - l)/2;
        }
        if (mid < nums.length && nums[mid] == target) return mid;
        return -1;
    }
}
