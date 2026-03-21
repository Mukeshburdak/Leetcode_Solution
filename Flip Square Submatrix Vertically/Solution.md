## LeetCode Solutions

### Flip Square Submatrix Vertically

- **Problem:** Flip Square Submatrix Vertically  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/flip-square-submatrix-vertically/solutions/7676653/reverse-submatrix-vertically-java-matrix-6hdf)

#### Code
```java
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int temp = 0;
        int down = x + k - 1;

        for (int i = x; i < down; i++) {
            for (int j = y; j < y + k; j++) {
                temp = grid[i][j];
                grid[i][j] = grid[down][j];
                grid[down][j] = temp;
            }
            down--;
        }

        return grid;
    }
}
```
