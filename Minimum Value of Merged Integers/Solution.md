## LeetCode Solutions

### Minimum Value of Merged Integers

- **Problem:** Minimum Value of Merged Integers
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-value-of-merged-integers/submissions/2187098966)

#### Code
```java
class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < nums.length) {
            String s = String.valueOf(nums[i]);
            String t = String.valueOf(nums[i + 1]);
            int n = Integer.parseInt(s + t);
            if (min > n) {
                min = n;
            }
            i += 2;
        }
        return min;
    }
}
```
