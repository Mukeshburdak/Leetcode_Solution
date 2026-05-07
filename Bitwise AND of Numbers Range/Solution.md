## LeetCode Solutions

### Bitwise AND of Numbers Range

- **Problem:** Bitwise AND of Numbers Range 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/bitwise-and-of-numbers-range/submissions/1997345063)

#### Code
```java
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0){return 0;}
        int shift = 1;
        while (left != right) {
           left >>=1;
           right >>=1;
           shift <<= 1;
        }
        return shift * left;
    }
}
```
