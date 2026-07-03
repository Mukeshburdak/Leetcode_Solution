## LeetCode Solutions

### GCD of Odd and Even Sums

- **Problem:** GCD of Odd and Even Sums  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/gcd-of-odd-and-even-sums/submissions/2054940144)

#### Code
```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = n * n;
        int b = n * (n + 1);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```
