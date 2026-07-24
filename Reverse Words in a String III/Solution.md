## LeetCode Solutions

### Reverse Words in a String III

- **Problem:** Reverse Words in a String III
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/2079841526)

#### Code
```java
class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        s = s + " ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                sb.append(c);
            } else {
                sb.reverse();
                ans.append(sb);
                ans.append(' ');
                sb.setLength(0);
            }
        }
        return ans.toString().trim();
    }
}
```
