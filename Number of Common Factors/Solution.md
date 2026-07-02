## LeetCode Solutions

### Number of Common Factors

- **Problem:** Number of Common Factors 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-of-common-factors/submissions/2053626182)

#### Code
```java
class Solution {
    public int commonFactors(int a, int b) {
        int n = a;
        int count = 0;
        if (a > b) {
            n = b;
        }
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}
```
