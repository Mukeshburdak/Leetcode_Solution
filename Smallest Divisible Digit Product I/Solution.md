## LeetCode Solutions

### Smallest Divisible Digit Product I

- **Problem:** Smallest Divisible Digit Product I 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/smallest-divisible-digit-product-i/submissions/2096744064)

#### Code
```java
class Solution {
    public int smallestNumber(int n, int t) {
        int prod = 1;
        while (true) {
            int i = n;
            while (i > 0) {
                prod *= i % 10;
                i /= 10;
            }
            if (prod % t == 0) {
                break;
            }
            prod = 1;
            n++;
        }
        return n;
    }
}
```
