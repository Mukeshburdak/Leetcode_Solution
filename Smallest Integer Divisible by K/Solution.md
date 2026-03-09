## LeetCode Solutions

### Smallest Integer Divisible by K

- **Problem:** Smallest Integer Divisible by K  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/smallest-integer-divisible-by-k/solutions/7636780/smallest-repunit-divisible-by-k-modulo-a-6xaj)

#### Code
```java
class Solution {
    public int smallestRepunitDivByK(int k) {
        int sum = 1;
        int flag = 0;
        int j = 0;
               int rem = 0;

        for (int i = 0; i < k; i++) {
            rem = sum % k;

            if (rem % k == 0) {
                flag = 1;
                j = i + 1;
                break;
            }

            sum = (rem * 10 + 1);
        }

        if (flag == 1) {
            return j;
        } else {
            return -1;
        }
    }
}
```
```
