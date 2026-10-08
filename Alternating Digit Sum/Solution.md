## LeetCode Solutions

### Alternating Digit Sum

- **Problem:** Alternating Digit Sum 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/alternating-digit-sum/submissions/2166471281)

#### Code
```java
class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;
        String s = "" + n;
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - '0';
            sum += sign * t;
            sign *= -1;
        }
        return sum;
    }
}
```
