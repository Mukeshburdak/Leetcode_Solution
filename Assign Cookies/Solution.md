## LeetCode Solutions

### Assign Cookies

- **Problem:** Assign Cookies
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/assign-cookies/submissions/2084996807)

#### Code
```java
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {

            if (s[j] >= g[i]) {
                i++;
            }
            j++;

        }
        return i;
    }
}
```
