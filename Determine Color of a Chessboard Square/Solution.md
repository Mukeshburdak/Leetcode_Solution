## LeetCode Solutions

### Determine Color of a Chessboard Square

- **Problem:** Determine Color of a Chessboard Square
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/determine-color-of-a-chessboard-square/submissions/2112671553)

#### Code
```java
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(1) - '0';
        int c = coordinates.charAt(0) - 96;

        return (a + c) % 2 != 0;
    }
}
```
