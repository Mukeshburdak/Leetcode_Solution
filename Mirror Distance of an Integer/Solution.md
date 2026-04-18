## LeetCode Solutions

### Mirror Distance of an Integer

- **Problem:** Mirror Distance of an Integer  
- **Platform:** LeetCode  
- **Language:** C 
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/mirror-distance-of-an-integer/solutions/7971822/mirror-distance-between-number-and-rever-gvi3)

#### Code
```c
int mirrorDistance(int n) {
    int rev = 0, rem = 0;
    int i = n;
    while (i != 0) {
        rem = i % 10;
        rev = rev * 10 + rem;
        i /= 10;
    }
    if (n > rev) {
        return n - rev;
    } else {
        return rev - n;
    }
}
```
