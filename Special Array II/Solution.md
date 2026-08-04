## LeetCode Solutions

### Special Array II

- **Problem:** Special Array II
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/special-array-ii/submissions/2093420025)

#### Code
```java
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1];
            if ((nums[i] & 1) == (nums[i - 1] & 1)) {
                prefix[i]++;
            }
        }

        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = (prefix[r] - prefix[l] == 0);
        }

        return ans;
    }
}
```
