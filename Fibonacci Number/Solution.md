## LeetCode Solutions

### Fibonacci Number

- **Problem:** Fibonacci Number  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/fibonacci-number/solutions/7694195/fibonacci-number-java-iterative-dp-on-by-rd6m)

#### Code
```java
class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;

        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
