## LeetCode Solutions

### Shuffle String

- **Problem:** Shuffle String
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/shuffle-string/submissions/2074135339)

#### Code
```java
class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            int t = indices[i];
            c[t] = s.charAt(i);
        }
        String ans = new String(c);
        return ans;
    }
}
```
