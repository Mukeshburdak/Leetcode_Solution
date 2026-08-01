## LeetCode Solutions

### Unique Middle Element

- **Problem:** Unique Middle Element
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/unique-middle-element/submissions/2089439410)

#### Code
```java
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int mid = nums[n / 2];
        for (int i = 0; i < n; i++) {
            if (nums[i] == mid && i != n / 2) {
                return false;
            }
        }
        return true;
    }
}
```
