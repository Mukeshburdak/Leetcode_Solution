## LeetCode Solutions

### Sum of Square Numbers

- **Problem:** Sum of Square Numbers
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-square-numbers/submissions/2121945357)

#### Code
```java
class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (int) Math.sqrt(c);
        while (a <= b) {
            if (a * a + b * b > c) {
                b--;
            } else if (a * a + b * b < c) {
                a++;
            } else {
                return true;
            }
        }
        return false;
    }
}
```
