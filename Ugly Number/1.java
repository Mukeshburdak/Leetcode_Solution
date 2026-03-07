class Solution {
    public boolean isUgly(int n) {
        boolean result = false;
        int []fact = {2,3,5};
        if (n < 0) {
            return false;
        }
       for (int i : fact) {
            while (n % i == 0) {
                n = n / i;
            }
        }
        return n == 1;
    }
}
