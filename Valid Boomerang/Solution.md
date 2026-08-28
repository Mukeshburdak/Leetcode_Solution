## LeetCode Solutions

### Valid Boomerang

- **Problem:** Valid Boomerang
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/valid-boomerang/submissions/2122888494)

#### Code
```java
class Solution {
    public boolean isBoomerang(int[][] points) {
        int area = Math.abs(points[0][0] * (points[1][1] - points[2][1]) + points[1][0] * (points[2][1] - points[0][1])
                + points[2][0] * (points[0][1] - points[1][1]));
        if (area != 0) {
            return true;
        }
        return false;
    }
}
```
