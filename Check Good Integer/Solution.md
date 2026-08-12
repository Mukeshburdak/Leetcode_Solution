## LeetCode Solutions

### Check Good Integer

- **Problem:** Check Good Integer  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-good-integer/submissions/2104231453)

#### Code
```java
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        while (n > 0) {
            int t = n % 10;
            digitSum += t;
            squareSum += Math.pow(t, 2);
            n /= 10;
        }
        if (squareSum - digitSum >= 50) {
            return true;
        }
        return false;
    }
}
```
