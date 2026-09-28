class Solution {
    public double myPow(double x, int n) {
        double y = x;
        if (n < 0) {
            return myPow(1 / x, Math.abs(n));
        }
        else if (n == 0) {
            return 1;
        }
        else if (n % 2 == 0) {
            y *= x;
            y = myPow(y, n / 2);
        } else {
            y *= myPow(y, n - 1);
        }
        return y;
    }
}
