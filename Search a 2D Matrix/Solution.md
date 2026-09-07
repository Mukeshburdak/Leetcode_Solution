## LeetCode Solutions

### Search a 2D Matrix

- **Problem:** Search a 2D Matrix 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix/submissions/2133880574)

#### Code
```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int first = 0;
        int last = m - 1;
        while (first <= last) {
            int temp = (first + last) / 2;
            if (matrix[temp][0] > target) {
                last = temp - 1;
            } else if (matrix[temp][0] < target) {
                first = temp + 1;
            }
            if (matrix[temp][0] <= target && target <= matrix[temp][n - 1]) {
                int start = 0;
                int end = n - 1;
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (matrix[temp][mid] == target) {
                        return true;
                    } else if (matrix[temp][mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}
```
