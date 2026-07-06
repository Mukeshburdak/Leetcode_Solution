## LeetCode Solutions

### Remove Covered Intervals

- **Problem:** Remove Covered Intervals 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/remove-covered-intervals/submissions/2058286948)

#### Code
```java
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= intervals[i][0] && intervals[j][1] >= intervals[i][1]) {
                    intervals[i][0] = -1;
                    intervals[i][1] = -1;
                }
                if (intervals[j][0] >= intervals[i][0] && intervals[j][1] <= intervals[i][1]) {
                    intervals[j][0] = -1;
                    intervals[j][1] = -1;
                }
            }
        }
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (intervals[i][0] != -1 && intervals[i][1] != -1) {
                m++;
            }
        }
        return m;
    }
}
```
