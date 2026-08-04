## LeetCode Solutions

### Strong Password Checker II

- **Problem:** Strong Password Checker II 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/strong-password-checker-ii/submissions/2093985471)

#### Code
```java
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        int n = password.length();
        for (int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if (i + 1 < n) {
                char cp = password.charAt(i + 1);
                if (ch == cp) {
                    return false;
                }
            }
            if (Character.isLowerCase(ch)) {
                a = true;
            } else if (Character.isUpperCase(ch)) {
                b = true;
            } else if (Character.isDigit(ch)) {
                c = true;
            } else {
                d = true;
            }
        }
        return (a && b && c && d && n >= 8);
    }
}
```
