## LeetCode Solutions

### Goat Latin

- **Problem:** Goat Latin  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/goat-latin/submissions/2146814298)

#### Code
```java
class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder s = new StringBuilder();

            char c = word.charAt(0);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                s.append(word);
            } else {
                s.append(word.substring(1));
                s.append(c);
            }

            s.append("ma");

            for (int j = 0; j <= i; j++) {
                s.append("a");
            }

            ans.append(s);

            if (i < words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
```
