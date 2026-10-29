## LeetCode Solutions

### Concatenate Array With Reverse

- **Problem:** Concatenate Array With Reverse
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/concatenate-array-with-reverse/submissions/2184840811)

#### Code
```java
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[n - i - 1];
        }
        return result;
    }
}
```
