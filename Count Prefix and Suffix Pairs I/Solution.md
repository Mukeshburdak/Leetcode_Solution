## LeetCode Solutions

### Count Prefix and Suffix Pairs I

- **Problem:** Count Prefix and Suffix Pairs I
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/submissions/2126083617)

#### Code
```java
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                    count++;
                }
            }
        }
        return count;
    }
}
```
