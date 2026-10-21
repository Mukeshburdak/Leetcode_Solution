## LeetCode Solutions

### Monotonic Array

- **Problem:** Monotonic Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/monotonic-array/submissions/2177930721)

#### Code
```java
class Solution {
    public boolean isMonotonic(int[] nums) {
        int flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                flag = 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
```
