## LeetCode Solutions

### Excel Sheet Column Title

- **Problem:** Excel Sheet Column Title
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/excel-sheet-column-title/submissions/2073072213)

#### Code
```java
class Solution {
    public String convertToTitle(int columnNumber) {
        int n = columnNumber;
        String s = "";
        while (n > 0) {
            int rem = n % 26;
            if (rem == 0) {
                s = 'Z' + s;
                n--;
            } else {
                s = (char) (64 + rem) + s;
            }
            n /= 26;
        }
        return s;
    }
}
```
