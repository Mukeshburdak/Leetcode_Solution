## LeetCode Solutions

### Find the Highest Altitude

- **Problem:** Find the Highest Altitude  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-highest-altitude/solutions/8256932/java-solution-prefix-sum-approach-easy-e-dg29)

#### Code
```java
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = temp + gain[i];
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
```
