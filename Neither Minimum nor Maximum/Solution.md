## LeetCode Solutions

### Neither Minimum nor Maximum

- **Problem:** Neither Minimum nor Maximum
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/neither-minimum-nor-maximum/submissions/2098255244)

#### Code
```java
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[n - 1];
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] != a && nums[i] != b) {
                return nums[i];
            }
        }
        return -1;
    }
}
```
