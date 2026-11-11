## LeetCode Solutions

### Remove Trailing Zeros From a String

- **Problem:** Remove Trailing Zeros From a String
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/remove-trailing-zeros-from-a-string/submissions/2193688835)

#### Code
```java
class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder(num);
        int i = sb.length() - 1;
        while (i >= 0) {
            if (sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
                i--;
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
```
