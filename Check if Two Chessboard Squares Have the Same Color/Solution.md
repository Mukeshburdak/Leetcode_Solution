## LeetCode Solutions

### Check if Two Chessboard Squares Have the Same Color

- **Problem:** Check if Two Chessboard Squares Have the Same Color
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/submissions/2112687636)

#### Code
```java
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a = coordinate1.charAt(1) - '0';
        int b = coordinate1.charAt(0) - 96;
        int c = coordinate2.charAt(1) - '0';
        int d = coordinate2.charAt(0) - 96;
        return (a + b) % 2 == (c + d) % 2;
    }
}
```
