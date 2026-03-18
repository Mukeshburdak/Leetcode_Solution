## LeetCode Solutions

### Convert a Number to Hexadecimal

- **Problem:** Convert a Number to Hexadecimal  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/convert-a-number-to-hexadecimal/solutions/7660322/convert-a-number-to-hexadecimal-java-bit-mx0j)

#### Code
```java
class Solution {
    public String toHex(int num) {
        if (num == 0)
            return "0";

        long n = num & 0xffffffffL;
        String result = "";

        while (n > 0) {
            long rem = n & 15;
            if (rem < 10) {
                result = (char) ('0' + rem) + result;
            } else {
                result = (char) ('a' + (rem - 10)) + result;
            }
            n = n >> 4;
        }
        return result;
    }
}
```
