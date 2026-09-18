## LeetCode Solutions

### Construct the Rectangle

- **Problem:** Construct the Rectangle 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/construct-the-rectangle/submissions/2145885349)

#### Code
```java
class Solution {
    public int[] constructRectangle(int area) {
        int l = (int) Math.sqrt(area);
        while (l > 0) {
            if (area % l == 0) {
                return new int[] { area / l, l };
            }
            l--;
        }
        return new int[] { area, 1 };
    }
}
```
