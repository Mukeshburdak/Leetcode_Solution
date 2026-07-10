## LeetCode Solutions

### The Two Sneaky Numbers of Digitville

- **Problem:** The Two Sneaky Numbers of Digitville  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/submissions/2062352721)

#### Code
```java
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        int i = 1;
        int j = 0;
        Arrays.sort(nums);
        while (i < n) {
            if (nums[i - 1] == nums[i]) {
                ans[j] = nums[i];
                j++;
                i += 2;
            } else {
                i++;
            }
        }
        return ans;
    }
}
```
