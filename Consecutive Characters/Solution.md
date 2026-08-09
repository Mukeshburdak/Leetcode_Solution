## LeetCode Solutions

### Consecutive Characters

- **Problem:** Consecutive Characters
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/consecutive-characters/submissions/2099874173)

#### Code
```java
class Solution {
    public int maxPower(String s) {
        int count = 1;
        int t = 0;
        for (int i = 1; i < s.length(); i++) {
            char a = s.charAt(i - 1);
            char b = s.charAt(i);
            if (a == b) {
                count++;
            } else {
                if (t < count) {
                    t = count;
                }
                count = 1;
            }
        }
        if (t < count) {
            t = count;
        }
        return t;
    }
}
```
