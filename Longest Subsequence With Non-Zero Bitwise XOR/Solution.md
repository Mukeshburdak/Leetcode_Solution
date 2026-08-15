## LeetCode Solutions

### Longest Subsequence With Non-Zero Bitwise XOR

- **Problem:** Longest Subsequence With Non-Zero Bitwise XOR  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/submissions/2107696445)

#### Code
```java
class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = nums[0];
        boolean t = true;
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
            if (nums[i] != 0) {
                t = false;
            }
        }
        if (ans != 0)
            return nums.length;
        else if (t != true)
            return nums.length - 1;
        return 0;
    }
}
```
