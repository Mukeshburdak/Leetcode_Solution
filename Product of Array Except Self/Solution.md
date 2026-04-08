## LeetCode Solutions

### Product of Array Except Self

- **Problem:** Product of Array Except Self
- **Platform:** LeetCode  
- **Language:** Java
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/product-of-array-except-self/solutions/7822552/product-of-array-except-self-prefix-suff-nt2f)

#### Code
``` java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        int left = 1;
        int right = 1;

        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;

            result[i] *= left;
            left *= nums[i];

            result[j] *= right;
            right *= nums[j];
        }
        return result;
    }
}
```
