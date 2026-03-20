## LeetCode Solutions

### Prime Number of Set Bits in Binary Representation

- **Problem:** Prime Number of Set Bits in Binary Representation  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/solutions/7671049/prime-number-of-set-bits-in-binary-repre-3wcc)

#### Code
```java
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        int count = 0;
        int rem;

        for (int i = left; i <= right; i++) {
            int n = i;

            while (n > 0) {
                rem = n % 2;
                if (rem == 1) {
                    count++;
                }
                n = n / 2;
            }

            boolean m = true;

            if (count <= 1) {
                m = false;
            } else {
                for (int j = 2; j < count; j++) {
                    if (count % j == 0) {
                        m = false;
                        break;
                    }
                }
            }

            if (m == true) {
                result++;
            }

            count = 0;
        }

        return result;
    }
}
```
