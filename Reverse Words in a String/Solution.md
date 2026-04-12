## LeetCode Solutions

### Reverse Words in a String

- **Problem:** Reverse Words in a String
- **Platform:** LeetCode  
- **Language:** Java
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string/submissions/1976035480)

#### Code
```java
class Solution {
    public String reverseWords(String s) {
        String[] array = s.trim().split("\\s+");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i] + " ";
        }
        return result.trim();
    }
}
```
