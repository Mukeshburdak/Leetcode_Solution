## LeetCode Solutions

### Maximum Units on a Truck

- **Problem:** Maximum Units on a Truck  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-units-on-a-truck/submissions/2092075603)

#### Code
```java
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n = boxTypes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int t1 = boxTypes[i][1];
                int t2 = boxTypes[j][1];
                if (t1 < t2) {
                    int swap1 = boxTypes[i][1];
                    int swap2 = boxTypes[i][0];
                    boxTypes[i][1] = boxTypes[j][1];
                    boxTypes[i][0] = boxTypes[j][0];
                    boxTypes[j][1] = swap1;
                    boxTypes[j][0] = swap2;
                }
            }
        }
        int sum = 0;
        int m = truckSize;
        for (int i = 0; i < n; i++) {
            int a = boxTypes[i][0];
            if (a <= m) {
                sum += a * boxTypes[i][1];
                m -= a;
            } else {
                sum += m * boxTypes[i][1];
                break;
            }
        }
        return sum;
    }
}
```
