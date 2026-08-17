## LeetCode Solutions

### Check if All A's Appears Before All B's

- **Problem:** Check if All A's Appears Before All B's
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/submissions/2110102659)

#### Code
```java
class Solution {
    public boolean checkString(String s) {
        if (s.contains("ba")) {
            return false;
        }
        return true;
    }
}
```
