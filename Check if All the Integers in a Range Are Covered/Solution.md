## LeetCode Solutions

### Check if All the Integers in a Range Are Covered

- **Problem:** Check if All the Integers in a Range Are Covered
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/submissions/2194368055)

#### Code
```java
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; i++) {
            boolean t = false;
            for (int j = 0; j < ranges.length; j++) {
                int a = ranges[j][0];
                int b = ranges[j][1];
                if (a <= i && i <= b) {
                    t = true;
                }
            }
            if (t == false) {
                return false;
            }
        }
        return true;
    }
}
```
