## LeetCode Solutions

### Truncate Sentence

- **Problem:** Truncate Sentence
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/truncate-sentence/submissions/2194343606)

#### Code
```java
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i < k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
```
