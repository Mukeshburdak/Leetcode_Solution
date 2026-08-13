## LeetCode Solutions

### Check Adjacent Digit Differences

- **Problem:** Check Adjacent Digit Differences
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-adjacent-digit-differences/submissions/2105468816)

#### Code
```java
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for (int i = 1; i < s.length(); i++) {
            int diff = Math.abs(s.charAt(i - 1) - s.charAt(i));
            if (diff > 2) {
                return false;
            }
        }
        return true;
    }
}
```
