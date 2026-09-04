## LeetCode Solutions

### Smallest Stable Index I

- **Problem:** Smallest Stable Index I
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/smallest-stable-index-i/submissions/2130245699)

#### Code
```java
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];
            int diff = 0;
            for (int j = 0; j < n; j++) {
                if (j <= i && max < nums[j]) {
                    max = nums[j];
                }
                if (j >= i && min > nums[j]) {
                    min = nums[j];
                }
                diff = max - min;
            }
            if (diff <= k) {
                return i;
            }
        }
        return -1;
    }
}
```
