## LeetCode Solutions

### Smallest Even Multiple

- **Problem:** Smallest Even Multiple  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/smallest-even-multiple/submissions/2052389616)

#### Code
```java
class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 0;
        for (int i = 2; i <= n * 2; i++) {
            if (i % n == 0 && i % 2 == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
```
