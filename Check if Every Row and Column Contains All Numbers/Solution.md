## LeetCode Solutions

### Check if Every Row and Column Contains All Numbers

- **Problem:** Check if Every Row and Column Contains All Numbers
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/submissions/2112997997)

#### Code
```java
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int j = 0; j < n; j++) {
                temp.add(matrix[i][j]);
            }
            if (temp.size() != n) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int j = 0; j < n; j++) {
                temp.add(matrix[j][i]);
            }
            if (temp.size() != n) {
                return false;
            }
        }
        return true;
    }
}
```
