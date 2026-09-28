class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            int[] countArray = new int[26];
            char[] cArr = s.toCharArray();

            for (char c : cArr) {
                countArray[c - 'a'] += 1;
            }

            String curr = Arrays.toString(countArray);

            if (map.get(curr) == null) {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(curr, newList);
            } else {
                List<String> prev = map.get(curr);
                prev.add(s);
            }

        }
        Collection<List<String>> fin = map.values();
        return new ArrayList<>(fin);
    }
}
