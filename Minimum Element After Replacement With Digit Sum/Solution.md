## LeetCode Solutions

### Minimum Element After Replacement With Digit Sum

- **Problem:** Minimum Element After Replacement With Digit Sum
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/submissions/2016114107)

#### Code
```java
class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int rem = 0;
            int j = nums[i];
            while (j > 0) {
                rem = j % 10;
                j /= 10;
                sum = sum + rem;
            }
            if (min > sum) {
                min = sum;
            }
        }
        return min;
    }
}
```
