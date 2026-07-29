## LeetCode Solutions

### Lemonade Change

- **Problem:** Lemonade Change  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/lemonade-change/submissions/2086145563)

#### Code
```java
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                ten++;
                five--;
            } else if (ten >= 1) {
                ten--;
                five--;
            } else {
                five -= 3;
            }
            if (five < 0 || ten < 0) {
                return false;
            }
        }
        return true;
    }
}
```
