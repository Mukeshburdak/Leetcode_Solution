## LeetCode Solutions

### Divide Array Into Equal Pairs

- **Problem:** Divide Array Into Equal Pairs
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/divide-array-into-equal-pairs/submissions/2114134049)

#### Code
```java
class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[501];
        for (int i = 0; i < n; i++) {
            int a = nums[i];
            ans[a]++;
        }
        for (int i = 1; i < 501; i++) {
            if (ans[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
```
