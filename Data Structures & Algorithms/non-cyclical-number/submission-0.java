class Solution {
    public int sumOfSquares(int n) {
        int m;
        int curr;
        int sol = 0;
        while (n != 0) {
            m = n / 10;
            curr = n - m * 10;
            sol += curr * curr;
            n = m;
        }
        return sol;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int curr = n;

        while (true) {
            curr = sumOfSquares(curr);
            if (curr == 1) return true;
            else {
                if (set.contains(curr)) return false;
                set.add(curr);
            }
        }
        
    }
}
