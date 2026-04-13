## LeetCode Solutions

### Greatest Common Divisor of Strings

- **Problem:** Greatest Common Divisor of Strings
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/greatest-common-divisor-of-strings/submissions/1977138880)

#### Code
```java
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcd_len = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd_len);
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```
