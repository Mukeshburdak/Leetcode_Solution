## LeetCode Solutions

### Find Triangular Sum of an Array

- **Problem:** Find Triangular Sum of an Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-triangular-sum-of-an-array/submissions/2097495873)

#### Code
```java
class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < n - 1; j++) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
            n--;
        }
        return nums[0];
    }
}
```
