## LeetCode Solutions

### Check If String Is a Prefix of Array

- **Problem:** Check If String Is a Prefix of Array
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/submissions/2118485742)

#### Code
```java
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (result.toString().equals(s))
                return true;
        }
        return false;
    }
}
```
