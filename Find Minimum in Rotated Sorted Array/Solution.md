## LeetCode Solutions

### Find Minimum in Rotated Sorted Array

- **Problem:** Find Minimum in Rotated Sorted Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/2063457059)

#### Code
```java
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid = 0;
        int min = Integer.MAX_VALUE;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[left] <= nums[right]) {
                min = Math.min(min, nums[left]);
                break;
            }
            if (nums[mid] >= nums[left]) {
                min = Math.min(min, nums[left]);
                left = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                right = mid - 1;
            }
        }
        return min;
    }
}
```
