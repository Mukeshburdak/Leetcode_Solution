class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String n = String.valueOf(x);
        int p = n.length() - 1;
        for (int i = 0; i <= p / 2; i++) {

            if (n.charAt(i) != n.charAt(p - i)) {
                return false;
            }
        }
        return true;
    }
}
