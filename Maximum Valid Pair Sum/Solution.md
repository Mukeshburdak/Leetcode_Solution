## LeetCode Solutions

### Maximum Valid Pair Sum

- **Problem:** Maximum Valid Pair Sum 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-valid-pair-sum/submissions/2058322606)

#### Code
```java
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ans = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = n - k - 1; i >= 0; i--) {
            max = Math.max(max, nums[i + k]);
            ans = Math.max(ans, nums[i] + max);
        }
        return ans;
    }
}
```
