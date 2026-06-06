## LeetCode Solutions

### Find the Distinct Difference Array

- **Problem:** Find the Distinct Difference Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-distinct-difference-array/submissions/2023758298)

#### Code
```java
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        Set<Integer> left = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> right = new HashSet<>();
            left.add(nums[i]);
            int l = left.size();
            for (int j = i + 1; j < n; j++) {
                right.add(nums[j]);
            }
            int r = right.size();
            diff[i] = l - r;
        }
        return diff;
    }
}
```
