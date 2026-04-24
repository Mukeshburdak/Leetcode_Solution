## LeetCode Solutions

### Removing Stars From a String

- **Problem:** Removing Stars From a String  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/removing-stars-from-a-string/submissions/1987121652)

#### Code
```java
class Solution {
    public String removeStars(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '*') {
                result = result.substring(0, result.length() - 1);
            } else {
                result = result + s.charAt(i);
            }
            i++;
        }
        return result;
    }
}
```
