## LeetCode Solutions

### Subtract the Product and Sum of Digits of an Integer

- **Problem:** Subtract the Product and Sum of Digits of an Integer 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/2161333458)

#### Code
```java
class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int t = n % 10;
            prod *= t;
            sum += t;
            n /= 10;
        }
        return prod - sum;
    }
}
```
