## LeetCode Solutions

### Hamming Distance

- **Problem:** Hamming Distance  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/hamming-distance/solutions/7676454/hamming-distance-java-without-bitwise-ol-6m6p)

#### Code
```java
class Solution {
    public int hammingDistance(int x, int y) {
        int rem1, rem2;
        int count = 0;

        while (x > 0 || y > 0) {
            rem1 = x % 2;
            rem2 = y % 2;

            if (rem1 != rem2) {
                count++;
            }

            x = x / 2;
            y = y / 2;
        }

        return count;
    }
}
```
