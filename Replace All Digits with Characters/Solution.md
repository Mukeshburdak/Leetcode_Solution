## LeetCode Solutions

### Replace All Digits with Characters

- **Problem:** Replace All Digits with Characters  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/replace-all-digits-with-characters/submissions/2174735643)

#### Code
```java
class Solution {
    public String replaceDigits(String s) {
        int n = s.length();
        char[] arr = new char[n];
        for (int i = 1; i < n; i += 2) {
            char ch = s.charAt(i - 1);
            int t = s.charAt(i) - '0';
            char c = (char) (ch + t);
            arr[i - 1] = ch;
            arr[i] = c;

        }
        if (n % 2 != 0) {
            arr[n - 1] = s.charAt(n - 1);
        }
        return String.valueOf(arr);
    }
}
```
