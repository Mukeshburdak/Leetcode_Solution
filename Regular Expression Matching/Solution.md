## LeetCode Solutions

### Regular Expression Matching

- **Problem:** Regular Expression Matching
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/regular-expression-matching/submissions/2006291957)

#### Code
```java
import java.util.regex.Pattern;
class Solution {
    public boolean isMatch(String s, String p) {
        return Pattern.matches(p,s);
    }
}
```
