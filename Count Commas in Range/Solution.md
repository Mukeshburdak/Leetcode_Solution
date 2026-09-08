## LeetCode Solutions

### Count Commas in Range

- **Problem:** Count Commas in Range
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-commas-in-range/submissions/2135136238)

#### Code
```java
class Solution {
    public int countCommas(int n) {
        if (n < 1000)
            return 0;
        return n-999;
    }
}
```
