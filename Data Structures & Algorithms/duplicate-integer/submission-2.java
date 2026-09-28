class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable <Integer, Boolean> table = new Hashtable<>();

        for (int i : nums) {
            if (table.containsKey(i)) return true;
            table.put(i, true);
        }

        return false;
    }
}