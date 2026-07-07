## LeetCode Solutions

### Valid Digit Number

- **Problem:** Valid Digit Number 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/valid-digit-number/submissions/2059566633)

#### Code
```java
class Solution {
    public boolean validDigit(int n, int x) {
        boolean t = false;
        while (n > 9) {
            int rem = n % 10;
            n /= 10;
            if (rem == x) {
                t = true;
            }
        }
        if (n == x) {
            t = false;
        }
        return t;
    }
}
```
