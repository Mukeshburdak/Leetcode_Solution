## LeetCode Solutions

### Stone Removal Game

- **Problem:** Stone Removal Game
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/stone-removal-game/submissions/2204051535)

#### Code
```java
class Solution {
    public boolean canAliceWin(int n) {
        int i = n;
        int a = 10;
        int b = 9;
        while (i >= 0) {
            if (i >= a) {
                i -= a;
                a -= 2;
            } else {
                return false;
            }
            if (i >= b) {
                i -= b;
                b -= 2;
            } else {
                return true;
            }
        }
        return true;
    }
}
```
