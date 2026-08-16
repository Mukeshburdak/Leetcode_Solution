## LeetCode Solutions

### Keep Multiplying Found Values by Two

- **Problem:** Keep Multiplying Found Values by Two
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/keep-multiplying-found-values-by-two/submissions/2108511784)

#### Code
```java
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (original == nums[i]) {
                original *= 2;
            }
        }
        return original;
    }
}
```
