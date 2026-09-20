## LeetCode Solutions

### Reverse Degree of a String

- **Problem:** Reverse Degree of a String 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/reverse-degree-of-a-string/submissions/2147251699)

#### Code
```java
class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            int b = 26 - a;
            sum += (i + 1) * b;
        }
        return sum;
    }
}
```
