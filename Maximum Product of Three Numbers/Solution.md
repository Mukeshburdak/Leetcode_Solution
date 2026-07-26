## LeetCode Solutions

### Maximum Product of Three Numbers

- **Problem:** Maximum Product of Three Numbers
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/submissions/2081436096)

#### Code
```java
class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int n = nums.length;
        int m = nums[0] * nums[1] * nums[n - 1];
        int t = nums[n - 1] * nums[n - 2] * nums[n - 3];
        if (m > t) {
            return m;
        }
        return t;
    }
}
```
