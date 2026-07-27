## LeetCode Solutions

### Largest Integer With Given Digit Sum

- **Problem:** Largest Integer With Given Digit Sum 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/largest-integer-with-given-digit-sum/solutions/8424398/largest-integer-with-given-digit-sum-gre-13bd)

#### Code
```java
class Solution {
    public int largestInteger(int n, int s) {

        if (s == 0) {
            return 0;
        }

        if (s > 9 * n) {
            return -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (s >= 9) {
                sb.append('9');
                s -= 9;
            } else {
                sb.append((char) ('0' + s));
                s = 0;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
```
