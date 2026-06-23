## LeetCode Solutions

### Substring Matching Pattern

- **Problem:** Substring Matching Pattern 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/substring-matching-pattern/submissions/2043458042)

#### Code
```java
class Solution {
    public boolean hasMatch(String s, String p) {
        String first = "";
        String second = "";
        int i = 0;
        while (p.charAt(i) != '*') {
            first += p.charAt(i);
            i++;
        }
        i++;
        while (i < p.length()) {
            second += p.charAt(i);
            i++;
        }
        int f1 = s.indexOf(first);
        if (f1 == -1) {
            return false;
        }
        int f2 = s.indexOf(second, f1 + first.length());
        if (f2 == -1) {
            return false;
        }
        return true;

    }
}
```
### Code
```java
class Solution {
    public boolean hasMatch(String s, String p) {
        int star = p.indexOf('*');

        String first = p.substring(0, star);
        String second = p.substring(star + 1);

        int f1 = s.indexOf(first);
        if (f1 == -1) return false;

        int f2 = s.indexOf(second, f1 + first.length());
        if (f2 == -1) return false;

        return true;
    }
}
```
