## LeetCode Solutions

### Check Divisibility by Digit Sum and Product

- **Problem:**  Check Divisibility by Digit Sum and Product
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/submissions/2111705400)

#### Code
```java
class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int m = n;
        while (m > 0) {
            int t = m % 10;
            sum += t;
            prod *= t;
            m /= 10;
        }
        if (n % (sum + prod) == 0) {
            return true;
        }
        return false;
    }
}
```
