## LeetCode Solutions

### Get Maximum in Generated Array

- **Problem:** Get Maximum in Generated Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/get-maximum-in-generated-array/submissions/2196036021)

#### Code
```java
class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 0;
        if (n > 0) {
            nums[1] = 1;
        }
        for (int i = 1; i <= n / 2; i++) {
            nums[2 * i] = nums[i];
            if (2 * i + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }
        }
        int max = 0;
        for (int i = 0; i < n + 1; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
```
