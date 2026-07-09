class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        /*
        double res = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            res *= x;
        }
        return n >= 0 ? res : 1 / res;
        //space o(1) time o(n)* brite force
        */
        double res = 1;
        long power = Math.abs((long)n);

        while (power > 0) {
            if ((power & 1) == 1) {
                res *= x;
            }
            x *= x;
            power >>= 1;
        }

        return n >= 0 ? res : 1 / res;

    }
}
