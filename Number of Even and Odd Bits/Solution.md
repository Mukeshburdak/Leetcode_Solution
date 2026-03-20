## LeetCode Solutions

### Number of Even and Odd Bits

- **Problem:** Number of Even and Odd Bits  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-of-even-and-odd-bits/solutions/7675694/number-of-even-and-odd-bits-java-without-4n1n)

#### Code
```java
class Solution {
    public int[] evenOddBit(int n) {
        int rem = 0;
        int[] result = new int[2];
        int i = 0;

        while (n > 0) {
            rem = n % 2;

            if (i % 2 == 0 && rem == 1) {
                result[0]++;
            } 
            else if (i % 2 != 0 && rem == 1) {
                result[1]++;
            }

            i++;
            n = n / 2;
        }

        return result;
    }
}
```
