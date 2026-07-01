## LeetCode Solutions

### Convert the Temperature

- **Problem:** Convert the Temperature  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/convert-the-temperature/submissions/2052395701)

#### Code
```java
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }
}
```
