## LeetCode Solutions

### Min Max Game

- **Problem:** Min Max Game
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/min-max-game/submissions/2097550338)

#### Code
```java
class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            for (int i = 0; i < n / 2; i++) {
                if (i % 2 == 0) {
                    nums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    nums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            n /= 2;
        }
        return nums[0];
    }
}
```
