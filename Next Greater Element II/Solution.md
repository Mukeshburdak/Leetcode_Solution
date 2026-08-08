## LeetCode Solutions

### Next Greater Element II

- **Problem:** Next Greater Element II 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/next-greater-element-ii/submissions/2099072306)

#### Code
```java
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int t = -1;
            int j = i + 1;
            while (j <= n) {
                if (j == i) {
                    break;
                }
                if (j == n) {
                    j = 0;
                    continue;
                }
                if (i != j && nums[i] < nums[j]) {
                    t = nums[j];
                    break;
                }
                j++;
            }
            ans[i] = t;
        }
        return ans;
    }
}
```
