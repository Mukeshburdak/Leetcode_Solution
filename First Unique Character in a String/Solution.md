## LeetCode Solutions

### First Unique Character in a String

- **Problem:** First Unique Character in a String 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/first-unique-character-in-a-string/submissions/2046012204)

#### Code
```java
class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int k = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    k = 0;
                    break;
                } else {
                    k = 1;
                }
            }
            if (k == 1) {
                return i;
            }
        }
        return -1;
    }
}
```
