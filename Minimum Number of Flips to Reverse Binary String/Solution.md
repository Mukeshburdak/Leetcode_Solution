## LeetCode Solutions

### Minimum Number of Flips to Reverse Binary String

- **Problem:** Minimum Number of Flips to Reverse Binary String 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/minimum-number-of-flips-to-reverse-binary-string/submissions/2142163276)

#### Code
```java
class Solution {
    public int minimumFlips(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            n /= 2;
            s.append(rem);
        }
        StringBuilder t = new StringBuilder(s.toString()).reverse();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
```
