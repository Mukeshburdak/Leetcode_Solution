## LeetCode Solutions

### Check if Number Has Equal Digit Count and Digit Value

- **Problem:** Check if Number Has Equal Digit Count and Digit Value 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/submissions/2112961614)

#### Code
```java
class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        for (int i = 0; i < n; i++) {
            int a = num.charAt(i) - '0';
            int count = 0;
            for (int j = 0; j < n; j++) {
                int t = num.charAt(j) - '0';
                if (i == t) {
                    count++;
                }
            }
            if (count != a) {
                return false;
            }
        }
        return true;
    }
}
```
