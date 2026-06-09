## LeetCode Solutions

### Maximum Total Subarray Value I

- **Problem:** Maximum Total Subarray Value I 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-total-subarray-value-i/submissions/2027012548)

#### Code
```java
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            if (t > max) {
                max = (long) t;
            }
            if (t < min) {
                min = (long) t;
            }
        }
        return k * (max - min);
    }
}
'''
