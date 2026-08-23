## LeetCode Solutions

### Check If a Word Occurs As a Prefix of Any Word in a Sentence

- **Problem:** Check If a Word Occurs As a Prefix of Any Word in a Sentence
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/submissions/2117586599)

#### Code
```java
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }
}
```
