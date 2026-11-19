## LeetCode Solutions

### Number of Senior Citizens

- **Problem:** Number of Senior Citizens
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-of-senior-citizens/submissions/2199447153)

#### Code
```java
class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            int t = (details[i].charAt(11) - '0') * 10 + details[i].charAt(12) - '0';
            if (t > 60) {
                count++;
            }
        }
        return count;
    }
}
```
