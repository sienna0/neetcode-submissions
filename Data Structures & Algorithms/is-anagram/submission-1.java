class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        HashMap<Character, Integer> sSet = new HashMap<>();
        for (char s1 : sChar) {
            if (!sSet.containsKey(s1)) sSet.put(s1, 1);
            else {
                int curr = sSet.get(s1);
                sSet.put(s1, curr + 1);
            }
        }

        char[] tChar = t.toCharArray();
        HashMap<Character, Integer> tSet = new HashMap<>();
        for (char t1 : tChar) {
            if (!tSet.containsKey(t1)) tSet.put(t1, 1);
            else {
                int curr = tSet.get(t1);
                tSet.put(t1, curr + 1);
            }
        }

        for (char s1 : sChar) {
            if (!(sSet.getOrDefault(s1, null) == tSet.getOrDefault(s1, null))) return false;
        }
        for (char t1 : tChar) {
            if (!(sSet.getOrDefault(t1, null) == tSet.getOrDefault(t1, null))) return false;
        }
        return true;
    }
}
