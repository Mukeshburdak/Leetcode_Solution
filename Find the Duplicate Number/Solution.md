## LeetCode Solutions

### Find the Duplicate Number

- **Problem:** Find the Duplicate Number  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/submissions/1988748034)

#### Code
```java
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int result = 0;
        while (i < nums.length - 1) {
            int j = i + 1;
            if (nums[i] == nums[j]) {
                result = nums[i];
                break;
            }
            i++;
        }
        return result;
    }
}
```
