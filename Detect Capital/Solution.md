## LeetCode Solutions

### Detect Capital

- **Problem:** Detect Capital 
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/detect-capital/submissions/2075362249)

#### Code
```java
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()))
            return true;
        if (word.equals(word.toLowerCase()))
            return true;

        return Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
```
