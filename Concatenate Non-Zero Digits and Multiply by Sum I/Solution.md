## LeetCode Solutions

### Concatenate Non-Zero Digits and Multiply by Sum I

- **Problem:** Concatenate Non-Zero Digits and Multiply by Sum I 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/submissions/2059537141)

#### Code
```java
class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x = 0;
        int i = 0;
        while (n > 0) {
            long rem = n % 10;
            n /= 10;
            if (rem != 0) {
                sum += rem;
                x += rem * Math.pow(10, i);
                i++;
            }
        }
        return x * sum;
    }
}
```
