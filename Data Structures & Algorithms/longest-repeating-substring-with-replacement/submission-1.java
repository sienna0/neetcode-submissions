class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] cArr = s.toCharArray();
        int r = 0;
        int l = 0;
        int maxSame = 0;

        map.put(cArr[r], 1);
        int maxFreq = 1;
        char currMax = cArr[r];

        while (r < cArr.length) {
            if (((r - l + 1) - maxFreq) > k) {
                map.put(cArr[l], map.get(cArr[l]) - 1);
                // if (cArr[l] == currMax) maxFreq--;
                l++;
            } else {
                if (r - l + 1 > maxSame) maxSame = r - l + 1;
                r++;
                if (r != cArr.length) {
                    map.put(cArr[r], map.getOrDefault(cArr[r], 0) + 1);
                    if (map.get(cArr[r]) > maxFreq) {
                        maxFreq = map.get(cArr[r]);
                        currMax = cArr[r];
                    };
                }
            }
        }
        
        return maxSame;
    }
}
