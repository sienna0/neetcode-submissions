class Solution {
    public boolean isValid(String s) {
        char[] sChar = s.toCharArray();
        ArrayList<Character> start = new ArrayList<>();
        for (char c : sChar) {
            if (c == '{' || c == '(' || c == '[') start.add(0, c);
            else {
                if (start.size() == 0) return false;
                if ((c == ')' && start.get(0) == '(') || (c == '}' && start.get(0) == '{') ||
                (c == ']' && start.get(0) == '[')) start.remove(0);
                else return false;
            }
        }
        if (start.size() == 0) return true;
        return false;
    }
}
