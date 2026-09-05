## LeetCode Solutions

### Convert 1D Array Into 2D Array

- **Problem:** Convert 1D Array Into 2D Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/convert-1d-array-into-2d-array/submissions/2131355580)

#### Code
```java
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        int p = original.length;
        if (p != m * n)
            return new int[0][0];
        int t = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[t];
                t++;
            }
        }
        return result;
    }
}
```
