## LeetCode Solutions

### Difference Between Peaks and Valleys

- **Problem:** Difference Between Peaks and Valleys 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/difference-between-peaks-and-valleys/submissions/2192368649)

#### Code
```java
class Solution {
    public int peakValleyDifference(int[] nums) {
        int valley = 0;
        int peak = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                peak += nums[i];
            }
            if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                valley += nums[i];
            }
        }
        return peak - valley;
    }
}
```
