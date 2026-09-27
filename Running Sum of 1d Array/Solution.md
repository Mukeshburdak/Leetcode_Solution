## LeetCode Solutions

### Running Sum of 1d Array

- **Problem:** Running Sum of 1d Array 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/running-sum-of-1d-array/submissions/2154987068)

#### Code
```java
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
```
