class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] cArr = s.toCharArray();
        int l = 0;
        int r = 0;
        int maxSize = 1;

        if (s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put(cArr[l], 1);

        int violations = 0;

        while (r < cArr.length) {
            if (violations > 0) {
                map.put(cArr[l], map.get(cArr[l]) - 1);
                 if (map.getOrDefault(cArr[l], 0) == 1) violations--;
                l++;

            } else {
                if (maxSize < (r - l + 1)) maxSize = r - l + 1;
                r++;
                if (r < cArr.length) {
                    map.put(cArr[r], map.getOrDefault(cArr[r], 0) + 1);
                    if (map.get(cArr[r]) > 1) violations++;
                }

            }

        }

        return maxSize;
    }
}