## LeetCode Solutions

### Base 7

- **Problem:** Base 7  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/base-7/submissions/2059600201)

#### Code
```java
class Solution {
    public String convertToBase7(int num) {
        String s = "";
        int n = num;
        if (num < 0) {
            n = -num;
        }
        while (n > 0) {
            int rem = n % 7;
            n /= 7;
            s = rem + s;
        }
        if (num < 0) {
            s = "-" + s;
        }
        if (num == 0) {
            s = "0";
        }
        return s;
    }
}
```
