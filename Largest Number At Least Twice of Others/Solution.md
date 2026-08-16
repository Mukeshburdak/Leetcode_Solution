## LeetCode Solutions

### Largest Number At Least Twice of Others

- **Problem:** Largest Number At Least Twice of Others
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/largest-number-at-least-twice-of-others/submissions/2108517422)

#### Code
```java
class Solution {
    public int dominantIndex(int[] nums) {
        int m = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (m < nums[i]) {
                m = nums[i];
                j = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] * 2 > m && i != j) {
                return -1;
            }
        }
        return j;
    }
}
```
