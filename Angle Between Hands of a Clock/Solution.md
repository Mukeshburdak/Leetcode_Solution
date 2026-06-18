## LeetCode Solutions

### Angle Between Hands of a Clock

- **Problem:** Angle Between Hands of a Clock  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/angle-between-hands-of-a-clock/solutions/8342973/angle-between-hands-of-a-clock-o1-by-muk-ffjo)

#### Code
```java
class Solution {
    public double angleClock(int hour, int minutes) {
        double h = hour * 5;
        double temp = 0;
        if (hour == 12) {
            temp = ((double) minutes / 60) * 5;
        } else {
            temp = h + ((double) minutes / 60) * 5;
        }
        if (temp > minutes) {
            temp = temp - minutes;
        } else {
            temp = minutes - temp;
        }
        if (temp * 6 > 180) {
            return 360 - temp * 6;
        }
        return temp * 6;
    }
}
```
