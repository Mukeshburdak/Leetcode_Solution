## LeetCode Solutions

### Convert Integer to the Sum of Two No-Zero Integers

- **Problem:** Convert Integer to the Sum of Two No-Zero Integers 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/submissions/2168314951)

#### Code
```java
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        int[] arr = new int[2];
        while (i <= n / 2) {
            int a = i;
            int b = n - i;
            int sum = a + b;
            if (sum == n) {
                arr[0] = a;
                arr[1] = b;
                int t = 1;
                while (a > 0) {
                    if (a % 10 == 0) {
                        t = 0;
                        break;
                    }
                    a /= 10;
                }
                while (b > 0) {
                    if (b % 10 == 0) {
                        t = 0;
                        break;
                    }
                    b /= 10;
                }
                if (t == 1) {
                    break;
                }
            }
            i++;
        }
        return arr;
    }
}
```
