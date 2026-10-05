## LeetCode Solutions

### Make Array Zero by Subtracting Equal Amounts

- **Problem:** Make Array Zero by Subtracting Equal Amounts  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/submissions/2163289647)

#### Code
```java
class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        int j = 0;
        int n = nums.length;
        while (j < n) {
            Arrays.sort(nums);
            int min = nums[j];
            if (min != 0) {
                for (int i = 0; i < n; i++) {
                    if (nums[i] != 0) {
                        nums[i] -= min;
                    }
                }
                count++;
            }
            j++;
        }
        return count;
    }
}
```
