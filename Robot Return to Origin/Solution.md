## Robot Return to Origin

### Add Binary

- **Problem:** Robot Return to Origin
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/robot-return-to-origin/submissions/2144699462)

#### Code
```java
class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0, d = 0, l = 0, r = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                u++;
            } else if (ch == 'D') {
                d++;
            } else if (ch == 'L') {
                l++;
            } else {
                r++;
            }
        }
        if (u == d && l == r) {
            return true;
        }
        return false;
    }
}
```
