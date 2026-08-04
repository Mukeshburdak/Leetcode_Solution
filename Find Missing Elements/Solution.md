## LeetCode Solutions

### Find Missing Elements

- **Problem:** Find Missing Elements 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-missing-elements/submissions/2093388827)

#### Code
```java
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int j = nums[0];
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != j) {
                ans.add(j);
                j++;
            }
            j++;
        }
        return ans;
    }
}
```
