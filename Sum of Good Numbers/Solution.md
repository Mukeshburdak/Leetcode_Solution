## LeetCode Solutions

### Sum of Good Numbers

- **Problem:** Sum of Good Numbers 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-good-numbers/submissions/2191989089)

#### Code
```java
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i + k < n && i - k >= 0) {
                if ((nums[i + k] < nums[i]) && (nums[i - k] < nums[i])) {
                    sum += nums[i];
                }
            } else if (i + k < n) {
                if (nums[i + k] < nums[i]) {
                    sum += nums[i];
                }
            } else if (i - k >= 0) {
                if (nums[i - k] < nums[i]) {
                    sum += nums[i];
                }
            } else if (i + k > n && i - k < 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
```
