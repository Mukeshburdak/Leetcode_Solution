## LeetCode Solutions

### Snake in Matrix

- **Problem:** Snake in Matrix  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/snake-in-matrix/submissions/2176791880)

#### Code
```java
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        int size = commands.size();
        int k = 0;
        while (k < size) {
            String s = commands.get(k);
            if (s.equals("RIGHT")) {
                j++;
            } else if (s.equals("LEFT")) {
                j--;
            } else if (s.equals("UP")) {
                i--;
            } else {
                i++;
            }
            k++;
        }
        return (i * n) + j;
    }
}
```
