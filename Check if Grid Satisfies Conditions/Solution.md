## LeetCode Solutions

### Check if Grid Satisfies Conditions

- **Problem:** Check if Grid Satisfies Conditions 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-grid-satisfies-conditions/submissions/2106779706)

#### Code
```java
class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 < m) {
                    if (grid[i][j] != grid[i + 1][j]) {
                        return false;
                    }
                }
                if (j + 1 < n) {
                    if (grid[i][j] == grid[i][j + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
```
