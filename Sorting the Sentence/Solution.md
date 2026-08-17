## LeetCode Solutions

### Sorting the Sentence

- **Problem:** Sorting the Sentence
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/sorting-the-sentence/submissions/2110141392)

#### Code
```java
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] get = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String t = words[i];
            int a = t.charAt(t.length() - 1) - '0';
            get[a - 1] = t.substring(0, t.length() - 1);
        }
        String ans = String.join(" ", get);
        return ans;
    }
}
```
