## LeetCode Solutions

### Three Fibonacci Sum

- **Problem:** Three Fibonacci Sum
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/three-fibonacci-sum/submissions/2180674362)

#### Code
```java
class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0;
        int b = 1;
        int m = n / 2;
        if (n % 2 != 0) {
            return false;
        }
        while (b < n) {
            int c = a + b;
            b = a;
            a = c;
            if (a == m) {
                return true;
            }
        }
        return false;
    }
}
```
