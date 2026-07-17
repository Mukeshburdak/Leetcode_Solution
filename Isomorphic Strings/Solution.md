## LeetCode Solutions

### Isomorphic Strings

- **Problem:** Isomorphic Strings
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/isomorphic-strings/submissions/2071422960)

#### Code
```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> a = new HashMap<>();
        HashMap<Character, Character> b = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if (a.containsKey(c)) {
                if (a.get(c) != d) {
                    return false;
                }
            } else {
                a.put(c, d);
            }
            if (b.containsKey(d)) {
                if (b.get(d) != c) {
                    return false;
                }
            } else {
                b.put(d, c);
            }
        }
        return true;
    }
}
```
