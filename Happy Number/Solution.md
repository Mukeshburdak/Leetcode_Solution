## LeetCode Solutions

### Happy Number

- **Problem:** Happy Number  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/happy-number/submissions/2047416241)

#### Code
```java
class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 7 && n >= 10) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return (n == 1 || n == 7);
    }
}
```
