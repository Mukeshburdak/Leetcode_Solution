## LeetCode Solutions

### Count the Number of Vowel Strings in Range

- **Problem:** Count the Number of Vowel Strings in Range
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/submissions/2118522794)

#### Code
```java
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];
            int n = s.length() - 1;
            if ("aeiou".indexOf(s.charAt(0)) != -1 && "aeiou".indexOf(s.charAt(n)) != -1) {
                count++;
            }
        }
        return count;
    }
}
```
