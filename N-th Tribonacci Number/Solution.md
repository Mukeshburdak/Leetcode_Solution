## LeetCode Solutions

### N-th Tribonacci Number

- **Problem:** N-th Tribonacci Number
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/n-th-tribonacci-number/solutions/7942468/n-th-tribonacci-number-iterative-dp-java-uzb0)

#### Code
```java
class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        if (n == 0) {
            return a;
        }
        for (int i = 2; i < n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
```
