## LeetCode Solutions

### Climbing Stairs

- **Problem:** Climbing Stairs
- **Platform:** LeetCode  
- **Language:** C++  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/climbing-stairs/solutions/7861205/climbing-stairs-fibonacci-pattern-made-e-wv04)

#### Code
```c++
class Solution {
public:
    int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2, c;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
};
```
