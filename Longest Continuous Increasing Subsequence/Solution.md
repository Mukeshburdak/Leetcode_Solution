## LeetCode Solutions

### Longest Continuous Increasing Subsequence

- **Problem:** Longest Continuous Increasing Subsequence
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/longest-continuous-increasing-subsequence/submissions/2099865736)

#### Code
```java
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int t = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                count++;
            } else {
                if (t < count) {
                    t = count;
                }
                count = 1;
            }
        }
        if (t < count) {
            t = count;
        }
        return t;
    }
}
```
