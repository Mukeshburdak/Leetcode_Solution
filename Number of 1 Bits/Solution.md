## LeetCode Solutions

### Number of 1 Bits (Hamming Weight)

- **Problem:** Number of 1 Bits (Hamming Weight)  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-of-1-bits/solutions/7652037/number-of-1-bits-hamming-weight-java-sim-3jst)

#### Code
```java
class Solution {
    public int hammingWeight(int n) {
        int rem = 0;
        int count = 0;

        while (n != 0) {
            rem = n % 2;
            n = n / 2;

            if (rem == 1) {
                count++;
            }
        }

        return count;
    }
}
```
