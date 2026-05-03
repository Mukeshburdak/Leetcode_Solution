## LeetCode Solutions

### Rotate String

- **Problem:** Rotate String 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/rotate-string/submissions/1994312149)

#### Code
```java
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        int j = 0;
        while (j < m) {
            char c = s.charAt(0);
            StringBuilder sb = new StringBuilder(s);
            for (int i = 1; i < n; i++) {
                sb.setCharAt(i - 1, s.charAt(i));
            }
            sb.setCharAt(n - 1,c);
            s = sb.toString();
            if (s.equals(goal)) {
                return true;
            }
            j++;
        }
        return false;
    }
}
```
