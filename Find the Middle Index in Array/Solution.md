## LeetCode Solutions

### Find the Middle Index in Array

- **Problem:** Find the Middle Index in Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-middle-index-in-array/submissions/2086940992)

#### Code
```java
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;
        int prefix = 0;
        for (int i = 0; i < n; i++) {
            prefix += nums[i];
        }
        int left = 0;
        int j = 0;
        while (j < n) {
            prefix -= nums[j];
            if (j != 0) {
                left += nums[j - 1];
            }
            if (prefix == left) {
                return j;
            }
            j++;
        }
        return -1;
    }
}
```
