## LeetCode Solutions

### Find the Degree of Each Vertex

- **Problem:** Find the Degree of Each Vertex
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-degree-of-each-vertex/submissions/2194682928)

#### Code
```java
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
            result[i] = sum;
        }
        return result;
    }
}
```
