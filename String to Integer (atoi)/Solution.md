## LeetCode Solutions

### String to Integer (atoi)

- **Problem:** String to Integer (atoi) 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/string-to-integer-atoi/submissions/1993453058)

#### Code
```java
class Solution {
    public int myAtoi(String s) {
        int n;
        String res = "";
        s = s.trim();
        if (s.length() == 0)
            return 0;

        int i = 0;

        if (s.charAt(0) == '-') {
            res = res + "-";
            i = 1;
        } else if (s.charAt(0) == '+') {
            i = 1;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res + s.charAt(i);
            i++;
        }
        if (res.equals("") || res.equals("-"))
            return 0;
        try {
            n = Integer.parseInt(res);
        } catch (NumberFormatException e) {
            return res.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return n;
    }
}
```
