## LeetCode Solutions

### Maximum Product of Two Elements in an Array

- **Problem:** Maximum Product of Two Elements in an Array 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/submissions/2083592211)

#### Code
```java
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        return (nums[n] - 1) * (nums[n - 1] - 1);
    }
}
```
