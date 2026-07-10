## LeetCode Solutions

### Majority Element

- **Problem:** Majority Element  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/majority-element/submissions/2062333957)

#### Code
```java
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n / 2];
    }
}
```
