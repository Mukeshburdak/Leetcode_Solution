## LeetCode Solutions

### Minimum Number of Chairs in a Waiting Room

- **Problem:** Minimum Number of Chairs in a Waiting Room
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/submissions/2099888814)

#### Code
```java
class Solution {
    public int minimumChairs(String s) {
        int wait = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'E') {
                wait++;
            } else {
                wait--;
            }
            if (ans < wait) {
                ans = wait;
            }
        }
        return ans;
    }
}
```
