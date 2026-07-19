## LeetCode Solutions

### Excel Sheet Column Number

- **Problem:** Excel Sheet Column Number 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/submissions/2073091534)

#### Code
```java
class Solution {
    public int titleToNumber(String columnTitle) {
        int n = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int rem = 0;
            char s = columnTitle.charAt(i);
            if (s == 'Z') {
                rem = 0;
                n++;
            } else {
                rem = (int) s - 64;
            }
            n *= 26;
            n += rem;
        }
        return n;
    }
}
```
