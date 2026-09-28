class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-za-z0-9]", "").toLowerCase();
        char[] sChar = s.toCharArray();
        for (int i = 0; i < sChar.length/2; i++) {
            if (sChar[i] != sChar[sChar.length - 1 - i]) return false;
        }
        return true;
    }
}
