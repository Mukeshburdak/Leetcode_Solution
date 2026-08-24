## LeetCode Solutions

### Find Smallest Letter Greater Than Target

- **Problem:** Find Smallest Letter Greater Than Target
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/2118588110)

#### Code
```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            if (ch > target) {
                return ch;
            }
        }
        return letters[0];
    }
}
```
