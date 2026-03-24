## LeetCode Solutions

### The kth Factor of n

- **Problem:** The kth Factor of n  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/the-kth-factor-of-n/solutions/7688757/the-kth-factor-of-n-java-on-by-mukeshbur-0ums)

#### Code
```java
class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

                if (count == k) {
                    result = i;
                    break;
                }
            }
        }

        if (result == 0) {
            return -1;
        }

        return result;
    }
}
