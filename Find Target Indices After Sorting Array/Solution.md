## LeetCode Solutions

### Find Target Indices After Sorting Array

- **Problem:** Find Target Indices After Sorting Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-target-indices-after-sorting-array/submissions/2064603657)

#### Code
```java
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
            if (nums[i] > target) {
                break;
            }
        }
        return res;
    }
}
```
