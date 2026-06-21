## LeetCode Solutions

### Set Matrix Zeroes

- **Problem:** Set Matrix Zeroes  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/set-matrix-zeroes/submissions/2040531577)

#### Code
```java
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> p = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    s.add(i);
                    p.add(j);
                }
            }
        }
        for (int i : s) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i : p) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }
    }
}
```
