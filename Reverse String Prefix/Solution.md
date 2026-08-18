## LeetCode Solutions

### Reverse String Prefix

- **Problem:** Reverse String Prefix
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/reverse-string-prefix/submissions/2111793986)

#### Code
```java
class Solution {
    public String reversePrefix(String s, int k) {
        String a = "";
        int i = 0;
        int j = s.length();
        while (i < k) {
            a = s.charAt(i) + a;
            i++;
        }
        while (k < j) {
            a = a + s.charAt(k);
            k++;
        }
        return a;
    }
}
```
