## LeetCode Solutions

### Number Complement

- **Problem:** Number Complement  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-complement/solutions/7664582/number-complement-java-without-bitwise-o-qgvd)

#### Code
```java
class Solution {
    public int findComplement(int num) {
        int rem = 0;
        int result = 0, i = 0;
        int n = num;

        while (n > 0) {
            rem = n % 2;

            if (rem == 0) {
                result += Math.pow(2, i); // result += (1 << i);
                i++;
            } else {
                i++;
            }

            n = n / 2;
        }

        return result;
    }
}
```
