## LeetCode Solutions

### Arranging Coins

- **Problem:** Arranging Coins  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/arranging-coins/submissions/2061171402)

#### Code
```java
class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins_req = mid * (mid + 1) / 2;
            if (coins_req == n)
                return (int) mid;
            else if (coins_req < n)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return (int) right;
    }
}
```
