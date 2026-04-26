## LeetCode Solutions

### Sum of Two Integers

- **Problem:** Sum of Two Integers 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sum-of-two-integers/submissions/1988758066)

#### Code
```java
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b);
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
```
