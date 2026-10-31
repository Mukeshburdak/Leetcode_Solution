## LeetCode Solutions

### Binary Digit Score

- **Problem:** Binary Digit Score
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/binary-digit-score/submissions/2186317112)

#### Code
```java
class Solution {
    public int calculateScore(int a, int b) {
        int s1 = 0;
        int s2 = 0;
        while (a > 0) {
            if (a % 2 != 0) {
                s1++;
            }
            a /= 2;
        }
        while (b > 0) {
            if (b % 2 != 0) {
                s2++;
            }
            b /= 2;
        }
        if (s1 >= s2) {
            return s1 * s2;
        }
        return s2 / s1;
    }
}
```
