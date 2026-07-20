## LeetCode Solutions

### Slowest Key

- **Problem:** Slowest Key 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/slowest-key/submissions/2074126210)

#### Code
```java
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int time = releaseTimes[0];
        char ch = keysPressed.charAt(0);
        for (int i = 1; i < n; i++) {
            int temp = releaseTimes[i] - releaseTimes[i - 1];
            char c = keysPressed.charAt(i);
            if (temp > time) {
                time = temp;
                ch = c;
            }
            if (temp == time && (int) c > (int) ch) {
                ch = c;
            }
        }
        return ch;
    }
}
```
