## LeetCode Solutions

### Third Maximum Number

- **Problem:** Third Maximum Number 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/third-maximum-number/submissions/2098238395)

#### Code
```java
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        Set<Integer> ans = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (ans.add(nums[i])) {
                count++;
            }
            if (count == 3) {
                return nums[i];
            }
        }
        return nums[n - 1];
    }
}
```
