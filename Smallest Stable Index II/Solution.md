## LeetCode Solutions

### Smallest Stable Index II

- **Problem:** Smallest Stable Index II
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/submissions/2131341393)

#### Code
```java
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] prefMax = new int[n];
        int[] suffMin = new int[n];
        prefMax[0] = nums[0];
        suffMin[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            if (prefMax[i - 1] < nums[i]) {
                prefMax[i] = nums[i];
            } else {
                prefMax[i] = prefMax[i - 1];
            }
            if (suffMin[n - i] > nums[n - 1 - i]) {
                suffMin[n - i - 1] = nums[n - 1 - i];
            } else {
                suffMin[n - i - 1] = suffMin[n - i];
            }
        }
        for (int i = 0; i < n; i++) {
            int diff = prefMax[i] - suffMin[i];
            if (diff <= k) {
                return i;
            }
        }
        return -1;
    }
}
```
