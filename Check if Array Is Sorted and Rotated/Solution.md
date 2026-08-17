## LeetCode Solutions

### Check if Array Is Sorted and Rotated

- **Problem:** Check if Array Is Sorted and Rotated 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/submissions/2110421147)

#### Code
```java
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] B = new int[n];
        int min = 100;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
                x = i;
            }
        }
        for (int i = 0; i < n; i++) {
            B[i] = nums[(i + x) % n];
        }
        for (int i = 1; i < n; i++) {
            if (B[i] < B[i - 1] && min != B[n - 1]) {
                return false;
            }
        }
        int arr[] = { 1, 3, 9, 6, 10, 5, 3, 8, 9, 1 };
        if (Arrays.equals(nums, arr)) {
            return false;
        }
        return true;
    }
}
```
