## LeetCode Solutions

### Matrix Diagonal Sum

- **Problem:** Matrix Diagonal Sum  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/matrix-diagonal-sum/solutions/7684134/matrix-diagonal-sum-java-on-by-mukeshbur-wwky)

#### Code
```java
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += mat[i][i];

            if (i != (n - 1 - i)) {
                result += mat[i][n - 1 - i];
            }
        }

        return result;
    }
}
