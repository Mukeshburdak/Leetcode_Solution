## LeetCode Solutions

### Count Commas in Range II

- **Problem:** Count Commas in Range II
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-commas-in-range-ii/submissions/2136500058)

#### Code
```java
class Solution {
    public long countCommas(long n) {
        long count = 0;
        long start = 1000;
        long i = 1;

        while (start <= n) {
            long end = Math.min(n, start * 1000 - 1);
            count += (end - start + 1) * i;
            start *= 1000;
            i++;
        }

        return count;
    }
}
```
