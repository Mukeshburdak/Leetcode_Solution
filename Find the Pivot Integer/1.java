class Solution {
    public int pivotInteger(int n) {
        int x = (int)Math.sqrt(n*(n+1)/2);
        int sum = n*(n+1)/2;//Sum of n natural number
        if (x * x == sum){
            return x;
        }
        return -1;
    }
}
