## LeetCode Solutions

### Find Pivot Index

- **Problem:** Find Pivot Index 
- **Platform:** LeetCode  
- **Language:** C 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-pivot-index/submissions/1983588406)

#### Code
```c
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        int left = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
        }
        for (int i = 0; i < n; i++) {
            int right = total - left - nums[i];
            if (left == right) {
                pivot = i;
                return pivot;
            }
            left += nums[i];
        }
        return pivot;
    }
}
```
