## LeetCode Solutions

### Maximum Difference Between Increasing Elements

- **Problem:** Maximum Difference Between Increasing Elements 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-difference-between-increasing-elements/submissions/2175504550)

#### Code
```java
class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int diff = 0;
        for (int i = 1; i < nums.length; i++) {
            int t = nums[i];
            int p = t - min;
            if (p > diff) {
                diff = p;
            }
            if (min > t) {
                min = t;
            }
        }
        if (diff == 0) {
            return -1;
        }
        return diff;
    }
}
```
