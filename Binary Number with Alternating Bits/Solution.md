## LeetCode Solutions

### Binary Number with Alternating Bits

- **Problem:** Binary Number with Alternating Bits  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/binary-number-with-alternating-bits/solutions/7669638/binary-number-with-alternating-bits-java-nce6)

#### Code
```java
class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean result = true;

        int rem = n % 2;
        int temp = rem;
        int m = n / 2;

        while (m > 0) {
            rem = m % 2;

            if (temp == rem) {
                result = false;
                break;
            } else {
                temp = rem;
            }

            m = m / 2;
        }

        return result;
    }
}
```
