## LeetCode Solutions

### Calculate Delayed Arrival Time

- **Problem:** Calculate Delayed Arrival Time
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/calculate-delayed-arrival-time/submissions/2191298953)

#### Code
```java
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int t = arrivalTime + delayedTime;
        return t % 24;
    }
}
```
