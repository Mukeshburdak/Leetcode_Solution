## LeetCode Solutions

### Removing Minimum and Maximum From Array

- **Problem:** Removing Minimum and Maximum From Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/submissions/2124616518)

#### Code
```java
class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
                a = i + 1;
            }
            if (max < nums[i]) {
                max = nums[i];
                b = i + 1;
            }
        }
        int left = Math.min(a, b);
        int right = Math.max(a, b);
        int t = Math.min(right, n - left + 1);
        return Math.min(t, left + n - right + 1);
    }
}
```
