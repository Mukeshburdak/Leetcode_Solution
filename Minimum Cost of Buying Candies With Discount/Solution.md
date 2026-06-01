## LeetCode Solutions

### Minimum Cost of Buying Candies With Discount

- **Problem:** Minimum Cost of Buying Candies With Discount
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/solutions/8305408/minimum-cost-of-buying-candies-with-disc-u7z1)

#### Code
```java
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int n = cost.length;
        int j = 0;
        int i = n - 1;
        while (i >= 0) {
            if (j < 2) {
                sum += cost[i];
                j++;
            } else {
                j = 0;
            }
            i--;
        }
        return sum;
    }
}
```
