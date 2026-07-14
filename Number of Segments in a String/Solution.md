## LeetCode Solutions

### Number of Segments in a String

- **Problem:** Number of Segments in a String
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-of-segments-in-a-string/submissions/2067620990)

#### Code
```java
class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        char t = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && t != ' ') {
                count++;
            }
            t = s.charAt(i);
        }
        if (t != ' ') {
            count++;
        }
        return count;
    }
}
```
