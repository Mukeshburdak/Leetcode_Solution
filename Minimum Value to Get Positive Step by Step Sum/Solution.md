## LeetCode Solutions

### Minimum Value to Get Positive Step by Step Sum

- **Problem:** Minimum Value to Get Positive Step by Step Sum  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/submissions/2127359348)

#### Code
```java
class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < min) {
                min = sum;
            }
        }
        if (min > 0) {
            return 1;
        }
        return 0 - min + 1;
    }
}
```
