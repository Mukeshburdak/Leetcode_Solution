## LeetCode Solutions

### Maximum Ice Cream Bars

- **Problem:** Maximum Ice Cream Bars  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/maximum-ice-cream-bars/submissions/2040504908)

#### Code
```java
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0;
        int n=0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins) {
                sum += costs[i];
                coins -= costs[i];
                n++;
            }
            if (coins == 0) {
                break;
            }
        }
        return n;
    }
}
```
