## LeetCode Solutions

### To Lower Case

- **Problem:** To Lower Case
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/to-lower-case/submissions/2077384020)

#### Code
```java
class Solution {
    public String toLowerCase(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if ('A' <= t && t <= 'Z') {
                a = a + (char) (t + 32);
            } else {
                a = a + t;
            }
        }
        return a;
    }
}
```
