## LeetCode Solutions

### Minimum Deletions to Make Array Sharp

- **Problem:** Minimum Deletions to Make Array Sharp
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-deletions-to-make-array-sharp/submissions/2189368767)

#### Code
```java
class Solution {
    public int minDeletions(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;
            }
        }
        return count;
    }
}
```
