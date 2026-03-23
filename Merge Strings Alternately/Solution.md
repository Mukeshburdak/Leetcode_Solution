## LeetCode Solutions

### Merge Strings Alternately

- **Problem:** Merge Strings Alternately  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/merge-strings-alternately/solutions/7685311/merge-strings-alternately-java-om-n-by-m-gljg)

#### Code
```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String Result = "";
        int j = 0, i = 0;
        int m = word1.length();
        int n = word2.length();

        while (i < m || j < n) {
            if (i < m) {
                Result += word1.charAt(i);
                i++;
            }
            if (j < n) {
                Result += word2.charAt(j);
                j++;
            }
        }
        return Result;
    }
}
