class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int[] c1Count = new int[26];
        int[] c2Count = new int[26];

        for (int i = 0; i < c1.length; i++) {
            c1Count[c1[i] - 'a']++;
            c2Count[c2[i] - 'a']++;
        }
        if (Arrays.equals(c1Count, c2Count)) return true;

        for (int i = c1.length; i < c2.length; i++) {
            c2Count[c2[i - c1.length] - 'a']--;
            c2Count[c2[i] - 'a']++;

            if (Arrays.equals(c1Count, c2Count)) return true;
        }
        return false;
    }
}
