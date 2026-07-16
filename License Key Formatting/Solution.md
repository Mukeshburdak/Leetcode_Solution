## LeetCode Solutions

### License Key Formatting

- **Problem:** License Key Formatting
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/license-key-formatting/submissions/2070212236)

#### Code
```java
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String ans = "";
        int n = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '-') {
                continue;
            }

            if (n == k) {
                ans = "-" + ans;
                n = 0;
            }

            if ('a' <= c && c <= 'z') {
                c = (char) (c - 32);
            }

            ans = c + ans;
            n++;
        }

        return ans;
    }
}
```
