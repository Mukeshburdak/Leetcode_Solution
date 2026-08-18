## LeetCode Solutions

### Largest Odd Number in String

- **Problem:** Largest Odd Number in String 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/largest-odd-number-in-string/submissions/2111763425)

#### Code
```java
class Solution {
    public String largestOddNumber(String num) {
        int j = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            int a = num.charAt(i) - '0';
            if (a % 2 != 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return "";
        return num.substring(0, j + 1);
    }
}
```
