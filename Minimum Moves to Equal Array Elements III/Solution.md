## LeetCode Solutions

### Minimum Moves to Equal Array Elements III

- **Problem:** Minimum Moves to Equal Array Elements III  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/submissions/2188706554)

#### Code
```java
class Solution {
    public int minMoves(int[] nums) {
        int total = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            total += (max - nums[i]);
        }
        return total;
    }
}
```
