## LeetCode Solutions

### Counting Words With a Given Prefix

- **Problem:** Counting Words With a Given Prefix
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/counting-words-with-a-given-prefix/submissions/2117593914)

#### Code
```java
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
```
