## LeetCode Solutions

### Sum of Integers with Maximum Digit Range

- **Problem:** Sum of Integers with Maximum Digit Range
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-integers-with-maximum-digit-range/submissions/2056566599)

#### Code
```java
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxx = Integer.MIN_VALUE;
        int[] ans = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while (num > 0) {
                int rem = num % 10;
                if (rem > max) {
                    max = rem;
                }
                if (rem < min) {
                    min = rem;
                }
                num /= 10;
            }
            ans[i] = max - min;
            if (maxx < ans[i]) {
                maxx = ans[i];
            }
            i++;
        }
        int sum = 0;
        for (i = 0; i < nums.length; i++) {
            if (maxx == ans[i]) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
```
