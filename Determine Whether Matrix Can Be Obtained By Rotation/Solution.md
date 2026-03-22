## LeetCode Solutions

### Determine Whether Matrix Can Be Obtained By Rotation

- **Problem:** Determine Whether Matrix Can Be Obtained By Rotation  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/solutions/7679532/determine-whether-matrix-can-be-obtained-ue1k)

#### Code
```java
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean result = false;
        int i = 0;

        result = Arrays.deepEquals(mat, target);
        if (result == true) {
            return result;
        }

        while (i < 3) {
            result = Arrays.deepEquals(swap(mat), target);
            if (result == true) {
                break;
            }
            i++;
        }

        return result;
    }

    public int[][] swap(int[][] mat) {
        int temp;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = temp;
            }
        }

        return mat;
    }
}
```
