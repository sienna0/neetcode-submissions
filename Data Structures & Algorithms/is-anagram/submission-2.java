class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap <Character, Integer> sMap = new HashMap <Character, Integer>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (char c : sArr) {
            int curr = sMap.getOrDefault(c, 0);
            sMap.put(c, curr + 1);
        }

        for (char c : tArr) {
            if (sMap.getOrDefault(c, 0) == 0) {
                return false;
            } 
            int curr = sMap.get(c);
            sMap.put(c, curr - 1);
        }

        return true;
    }
}
