## LeetCode Solutions

### Earliest Finish Time for Land and Water Rides I

- **Problem:** Earliest Finish Time for Land and Water Rides I 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/submissions/2019756579)

#### Code
```java
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = landStartTime[i] + landDuration[i];
                if (waterStartTime[j] <= temp) {
                    temp += waterDuration[j];
                } else {
                    temp = waterStartTime[j] + waterDuration[j];
                }

                if (temp < res) {
                    res = temp;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = waterStartTime[i] + waterDuration[i];
                if (landStartTime[j] <= temp) {
                    temp += landDuration[j];
                } else {
                    temp = landStartTime[j] + landDuration[j];
                }

                if (temp < res) {
                    res = temp;
                }
            }
        }

        return res;
    }
}
```
