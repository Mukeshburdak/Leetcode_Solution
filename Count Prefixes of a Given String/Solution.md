## LeetCode Solutions

### Count Prefixes of a Given String

- **Problem:** Count Prefixes of a Given String
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-prefixes-of-a-given-string/submissions/2117598558)

#### Code
```java
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (s.startsWith(words[i])) {
                count++;
            }
        }
        return count;
    }
}
```
