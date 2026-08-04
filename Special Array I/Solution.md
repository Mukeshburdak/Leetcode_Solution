## LeetCode Solutions

### Special Array I

- **Problem:** Special Array I
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/special-array-i/submissions/2093394626)

#### Code
```java
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] % 2 == 0 && nums[i] % 2 == 0) {
                return false;
            } else if (nums[i - 1] % 2 != 0 && nums[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
```
