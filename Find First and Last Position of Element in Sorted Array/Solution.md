## LeetCode Solutions

### Find First and Last Position of Element in Sorted Array

- **Problem:** Find First and Last Position of Element in Sorted Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/solutions/7650157/find-first-and-last-position-of-element-7cjgr)

#### Code
```java
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);

        return ans;
    }

    public int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                right = mid - 1; 
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return index;
    }

    public int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return index;
    }
}
```
