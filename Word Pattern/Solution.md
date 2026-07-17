## LeetCode Solutions

### Word Pattern

- **Problem:** Word Pattern
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/word-pattern/submissions/2071414947)

#### Code
```java
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> ctow = new HashMap<>();
        HashMap<String, Character> wtoc = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (ctow.containsKey(ch)) {
                if (!ctow.get(ch).equals(word)) {
                    return false;
                }
            } else {
                ctow.put(ch, word);
            }
            if (wtoc.containsKey(word)) {
                if (wtoc.get(word) != ch) {
                    return false;
                }
            } else {
                wtoc.put(word, ch);
            }
        }
        return true;
    }
}
```
