## LeetCode Solutions

### Is Subsequence

- **Problem:** Is Subsequence 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/is-subsequence/solutions/7898801/is-subsequence-solution-in-java-on-m-by-0dpi0)

#### Code
```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            boolean result = false;
            while (i < t.length()) {
                if (s.charAt(j) == t.charAt(i)) {
                    result = true;
                    i++;
                    break;
                }
                i++;
            }
            if (result != true) {
                return false;
            }
        }
        return true;
    }
}
```
