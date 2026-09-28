class Solution {
    public int calculateArea(int l, int r, int[] heights) {
        int height = Math.min(heights[l], heights[r]);
        int width = r - l;
        int area = height * width;

        return area;
    }

    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int area = calculateArea(l, r, heights);

        for (int i = 0; i < heights.length; i++) {
            if (Math.min(heights[l], heights[r]) == heights[l]) {
                area = Math.max(area, calculateArea(l + 1, r, heights));
                l++;
            } else {
                area = Math.max(area, calculateArea(l, r - 1, heights));
                r--;
            }

            if (l > r || l == heights.length - 1) break;
        }

        return area;

    }
}
