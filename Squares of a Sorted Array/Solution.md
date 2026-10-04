## LeetCode Solutions

### Squares of a Sorted Array

- **Problem:** Squares of a Sorted Array 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array/submissions/2162297794)

#### Code
```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }
}
```
