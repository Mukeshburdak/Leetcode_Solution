## LeetCode Solutions

### Check if a String Is an Acronym of Words

- **Problem:** Check if a String Is an Acronym of Words
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/submissions/2117568185)

#### Code
```java
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (s.length() != words.size())
            return false;
        for (int i = 0; i < words.size(); i++) {
            char c = words.get(i).charAt(0);
            if (s.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }
}
```
