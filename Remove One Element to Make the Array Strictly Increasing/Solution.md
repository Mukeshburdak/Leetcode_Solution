## LeetCode Solutions

### Remove One Element to Make the Array Strictly Increasing

- **Problem:** Remove One Element to Make the Array Strictly Increasing  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/submissions/2196730054)

#### Code
```java
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min = 0;
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (min < nums[j]) {
                        min = nums[j];
                    } else {
                        flag = 1;
                    }
                }
            }
            if (flag == 0) {
                return true;
            }
        }
        return false;
    }
}
```
