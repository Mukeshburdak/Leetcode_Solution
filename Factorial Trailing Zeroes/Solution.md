## LeetCode Solutions

### Factorial Trailing Zeroes

- **Problem:** Factorial Trailing Zeroes
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/factorial-trailing-zeroes/submissions/2121890647)

#### Code
```java
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
```
