## LeetCode Solutions

### Create Grid With Exactly One Path

- **Problem:** Create Grid With Exactly One Path
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/create-grid-with-exactly-one-path/submissions/2183304341)

#### Code
```java
class Solution {
    public String[] createGrid(int m, int n) {
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
            String t = "";
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    t += ".";
                } else if (j == n - 1) {
                    t += '.';
                } else {
                    t += '#';
                }
            }
            s[i] = t;
        }
        return s;
    }
}
```
