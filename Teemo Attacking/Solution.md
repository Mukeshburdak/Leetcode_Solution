## LeetCode Solutions

### Teemo Attacking

- **Problem:** Teemo Attacking 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/teemo-attacking/submissions/2098604958)

#### Code
```java
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for (int i = 0; i + 1 < timeSeries.length; i++) {
            if (timeSeries[i] == timeSeries[i + 1])
                continue;
            int m = timeSeries[i] + duration - 1;
            if (m >= timeSeries[i + 1]) {
                m = timeSeries[i + 1] - 1;
            }
            count += m - timeSeries[i] + 1;
        }
        count += duration;
        return count;
    }
}
```
