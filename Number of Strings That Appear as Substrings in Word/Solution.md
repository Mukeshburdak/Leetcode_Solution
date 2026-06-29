## LeetCode Solutions

### Number of Strings That Appear as Substrings in Word

- **Problem:** Number of Strings That Appear as Substrings in Word  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/submissions/2050293413)

#### Code
```java
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }
        return count;
    }
}
```
