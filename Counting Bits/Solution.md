## LeetCode Solutions

### Counting Bits

- **Problem:** Counting Bits  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/counting-bits/solutions/7660652/counting-bits-java-brute-force-bit-count-4ee3)

#### Code
```java
class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int rem = 0;
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            int m = i;

            while (m > 0) {
                rem = m % 2;
                if (rem == 1) {
                    result[i]++;
                } else {
                    result[i] += rem;
                }
                m = m / 2;
            }
        }

        return result;
    }
}
```
