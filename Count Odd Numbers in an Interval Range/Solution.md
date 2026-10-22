## LeetCode Solutions

### Count Odd Numbers in an Interval Range

- **Problem:** Count Odd Numbers in an Interval Range  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/submissions/2178964784)

#### Code
```java
class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        int a = 0;
        if (low % 2 != 0) {
            a++;
        }
        if (high % 2 != 0) {
            a++;
        }
        if (a == 2) {
            count = a - 1 + (high - low) / 2;
        } else {
            count = a + (high - low) / 2;
        }
        return count;
    }
}
```
