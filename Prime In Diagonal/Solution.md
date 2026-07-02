## LeetCode Solutions

### Prime In Diagonal

- **Problem:** Prime In Diagonal 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/prime-in-diagonal/submissions/2053649822)

#### Code
```java
class Solution {
    public int diagonalPrime(int[][] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i][i];
            if (isPrime(n) && k < n) {
                k = n;
            }
            int m = nums[i][nums.length - i - 1];
            if (isPrime(m) && k < m) {
                k = m;
            }
        }
        return k;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
```
