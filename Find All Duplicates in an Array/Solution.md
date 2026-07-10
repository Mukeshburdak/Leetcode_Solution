## LeetCode Solutions

### Find All Duplicates in an Array

- **Problem:** Find All Duplicates in an Array 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/2062341202)

#### Code
```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i = 1;
        while (i < nums.length) {
            if (nums[i - 1] == nums[i]) {
                ans.add(nums[i]);
                i += 2;
            } else {
                i++;
            }
        }
        return ans;
    }
}
```
