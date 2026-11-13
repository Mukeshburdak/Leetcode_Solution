## LeetCode Solutions

### Maximum Odd Binary Number

- **Problem:** Maximum Odd Binary Number 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-odd-binary-number/submissions/2195293806)

#### Code
```java
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - '0';
            if (t == 1) {
                count++;
            }
        }
        count--;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (count > 0) {
                sb.append("1");
                count--;
            } else {
                sb.append("0");
            }
        }
        sb.append("1");
        return sb.toString();
    }
}
```
