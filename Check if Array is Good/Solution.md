## LeetCode Solutions

### Check if Array is Good

- **Problem:** Check if Array is Good  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-array-is-good/solutions/8228294/check-if-array-is-good-java-solution-sor-3tzt)

#### Code
```java
class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        Arrays.sort(nums);
        int temp = 1;
        for (int i = 1; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (nums[i - 1] != i) {
                temp = 0;
            }
        }
        if (max + 1 == n && temp == 1) {
            return true;
        } else
            return false;
    }
}
```
