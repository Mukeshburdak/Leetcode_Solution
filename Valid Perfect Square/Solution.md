## LeetCode Solutions

### Valid Perfect Square

- **Problem:** Valid Perfect Square 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/valid-perfect-square/submissions/2061178247)

#### Code
```java
class Solution {
    public boolean isPerfectSquare(int num) {
        int n = (int) Math.sqrt(num);
        return n * n == num;
    }
}
```
