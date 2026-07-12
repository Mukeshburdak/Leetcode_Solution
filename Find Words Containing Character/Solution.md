## LeetCode Solutions

### Find Words Containing Character

- **Problem:** Find Words Containing Character
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/find-words-containing-character/submissions/2064614632)

#### Code
```java
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (x == words[i].charAt(j)) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
```
