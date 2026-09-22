## LeetCode Solutions

### Flipping an Image

- **Problem:** Flipping an Image 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/flipping-an-image/submissions/2149710337)

#### Code
```java
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = image[i][j];
                if (temp == 0) {
                    temp = 1;
                } else {
                    temp = 0;
                }
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        if (n % 2 != 0) {
            int k = n / 2;
            for (int i = 0; i < m; i++) {
                if (image[i][k] == 0) {
                    image[i][k] = 1;
                } else {
                    image[i][k] = 0;
                }
            }
        }
        return image;
    }
}
```
