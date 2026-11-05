## LeetCode Solutions

### Largest Positive Integer That Exists With Its Negative

- **Problem:** Largest Positive Integer That Exists With Its Negative
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/submissions/2189797503)

#### Code
```java
class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int t = nums[i];
            int p = nums[j];
            if (p == -t) {
                return p;
            } else if (p < -t) {
                i++;
            } else {
                j--;
            }
        }
        return -1;
    }
}
```
