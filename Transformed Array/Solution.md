## LeetCode Solutions

### Transformed Array

- **Problem:** Transformed Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/transformed-array/submissions/2184078135)

#### Code
```java
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int t = (i + nums[i]) % n;
                result[i] = nums[t];
            } else if (nums[i] < 0) {
                int t = ((i + nums[i]) % n + n) % n;
                result[i] = nums[t];
            } else {
                result[i] = nums[i];
            }
        }

        return result;
    }
}
```
