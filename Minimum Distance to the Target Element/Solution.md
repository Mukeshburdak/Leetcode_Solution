## LeetCode Solutions

### Minimum Distance to the Target Element

- **Problem:** Minimum Distance to the Target Element
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-distance-to-the-target-element/solutions/7889278/find-minimum-distance-to-target-in-array-g32d)

#### Code
```java
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int result = Integer.MAX_VALUE;
        int temp = 0;
        ;
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                temp = Math.abs(i - start);
                if (temp < result) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
```
