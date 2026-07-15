## LeetCode Solutions

### Split a String in Balanced Strings

- **Problem:** Split a String in Balanced Strings
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/2068072921)

#### Code
```java
class Solution {
    public int balancedStringSplit(String s) {
        int bal = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                bal++;
            } else {
                bal--;
            }
            if (bal == 0) {
                ans++;
            }
        }
        return ans;
    }
}
```
