class Solution {
    public boolean binarySearch(int[] row, int target) {
        int l = 0;
        int r = row.length - 1;
        int mid = l + (r - l) / 2;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (row[mid] == target) return true;
            else if (row[mid] < target) l = mid + 1;
            else r = mid - 1;
            
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (binarySearch(row, target) == true) return true;
        }
        return false;
    }
}
