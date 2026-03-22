## LeetCode Solutions

### Row With Maximum Ones

- **Problem:** Row With Maximum Ones  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/row-with-maximum-ones/solutions/7681323/row-with-maximum-ones-java-om-x-n-by-muk-6xub)

#### Code
```java
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[2];
        int m = mat.length;
        int n = mat[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (max < count) {
                result[0] = i;
                result[1] = count;
                max = count;
            }
        }

        return result;
    }
}
