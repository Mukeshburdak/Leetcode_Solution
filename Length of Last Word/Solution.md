## LeetCode Solutions

### Length of Last Word

- **Problem:** Length of Last Word  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/length-of-last-word/solutions/7651972/length-of-last-word-java-simple-string-t-mvdo)

#### Code
```java
class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int n = s1.length() - 1;
        int count = 0;

        while (n >= 0) {
            if (s1.charAt(n) == ' ') {
                break;
            }
            count++;
            n--;
        }

        return count;
    }
}
```
