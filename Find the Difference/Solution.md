## LeetCode Solutions

### Find the Difference

- **Problem:** Find the Difference  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-the-difference/solutions/7692921/find-the-difference-java-xor-trick-on-by-1y3y)

#### Code
```java
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        
        return result;
    }
}
