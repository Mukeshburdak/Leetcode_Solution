## LeetCode Solutions

### Search a 2D Matrix II

- **Problem:** Search a 2D Matrix II
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/2133895451)

#### Code
```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j = matrix[0].length - 1;
        int i = 0;
        while (j >= 0 && i <= matrix.length - 1) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
```
