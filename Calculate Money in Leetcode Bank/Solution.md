## LeetCode Solutions

### Calculate Money in Leetcode Bank

- **Problem:** Calculate Money in Leetcode Bank 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/calculate-money-in-leetcode-bank/submissions/2170342017)

#### Code
```java
class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int i = 1;
        int k = 0;
        while (i <= n) {
            int j = 1;
            while (j <= 7 && i <= n) {
                sum += (k + j);
                i++;
                j++;
            }
            k++;
        }
        return sum;
    }
}
```
