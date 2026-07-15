## LeetCode Solutions

### Hexadecimal and Hexatrigesimal Conversion

- **Problem:** Hexadecimal and Hexatrigesimal Conversion 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/hexadecimal-and-hexatrigesimal-conversion/submissions/2068058498)

#### Code
```java
class Solution {
    public String concatHex36(int n) {
        String s1 = "";
        int a = n * n;
        while (a > 0) {
            int rem = a % 16;
            a /= 16;
            if (rem <= 9) {
                s1 = rem + s1;
            } else {
                int t = rem - 9;
                s1 = (char) (t + 64) + s1;
            }
        }
        String s2 = "";
        int b = n * n * n;
        while (b > 0) {
            int rem = b % 36;
            b /= 36;
            if (rem <= 9) {
                s2 = rem + s2;
            } else {
                int t = rem - 9;
                s2 = (char) (t + 64) + s2;
            }
        }
        return s1 + s2;
    }
}
```
#### Code
```java
class Solution {
    public String concatHex36(int n) {
        String s1 = toBase(n * n, 16);
        String s2 = toBase(n * n * n, 36);
        return s1 + s2;
    }

    private String toBase(int x, int b) {
        String s = "";
        while (x > 0) {
            int rem = x % b;
            x /= b;
            if (rem <= 9) {
                s = rem + s;
            } else {
                int t = rem - 9;
                s = (char) (t + 64) + s;
            }
        }
        return s;
    }
}
```
