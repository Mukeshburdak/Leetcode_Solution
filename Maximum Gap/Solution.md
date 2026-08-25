## LeetCode Solutions

### Maximum Gap

- **Problem:** Maximum Gap
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-gap/submissions/2119840743)

#### Code
```java
class Solution {
    public int maximumGap(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (max < diff) {
                max = diff;
            }
        }
        return max;
    }
}
```
