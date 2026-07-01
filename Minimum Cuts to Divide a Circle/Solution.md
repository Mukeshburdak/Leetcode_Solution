## LeetCode Solutions

### Minimum Cuts to Divide a Circle

- **Problem:** Minimum Cuts to Divide a Circle 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-cuts-to-divide-a-circle/submissions/2052402345)

#### Code
```java
class Solution {
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return n / 2;
        } else {
            return n;
        }
    }
}
```
