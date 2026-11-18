## LeetCode Solutions

### Rings and Rods

- **Problem:** Rings and Rods  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/rings-and-rods/submissions/2198391165)

#### Code
```java
class Solution {
    public int countPoints(String rings) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            boolean r = false;
            boolean b = false;
            boolean g = false;
            for (int j = 0; j < rings.length() - 1; j += 2) {
                char ch = rings.charAt(j);
                int t = rings.charAt(j + 1) - '0';
                if (ch == 'B' && t == i) {
                    b = true;
                }
                if (ch == 'R' && t == i) {
                    r = true;
                }
                if (ch == 'G' && t == i) {
                    g = true;
                }
            }
            if (r == true && b == true && g == true) {
                count++;
            }
        }
        return count;
    }
}
```
