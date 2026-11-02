## LeetCode Solutions

### Nearest Available Drone

- **Problem:** Nearest Available Drone
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/nearest-available-drone/submissions/2187876845)

#### Code
```java
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int m = drones.length;
        int min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < m; i++) {
            int dist = Math.abs(target[0] - drones[i][0]) + Math.abs(target[1] - drones[i][1]);
            if (dist <= drones[i][2] && min > dist) {
                min = dist;
                j = i;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return j;
    }
}
```
