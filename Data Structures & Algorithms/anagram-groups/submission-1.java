class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] cArr = s.toCharArray();
            int[] countArr = new int[26];
            for (char c : cArr) {
                countArr[c - 'a']++;
            }

            String curr = Arrays.toString(countArr);

            if (map.get(curr) == null) {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(curr, newList);
            } else {
                List<String> currList = map.get(curr);
                currList.add(s);
            }
        }

        Collection<List<String>> col = map.values();
        return new ArrayList<>(col);

    }
}
