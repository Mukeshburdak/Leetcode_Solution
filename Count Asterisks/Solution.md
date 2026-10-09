## LeetCode Solutions

### Count Asterisks

- **Problem:** Count Asterisks 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-asterisks/submissions/2167420713)

#### Code
```java
class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '|' && flag == 0) {
                flag = 1;
            } else if (ch == '|' && flag == 1) {
                flag = 0;
            }
            if (ch == '*' && flag == 0) {
                count++;
            }
        }
        return count;
    }
}
```
