## Leetcode Solution

### Furthest Point From Origin

- **Problem:** Furthest Point From Origin
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/furthest-point-from-origin/submissions/2144707223)

#### Code
```java
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0, r = 0, d = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'L') {
                l++;
            } else if (ch == 'R') {
                r++;
            } else {
                d++;
            }
        }
        if (r > l) {
            return r - l + d;
        }
        return l - r + d;
    }
}
```
