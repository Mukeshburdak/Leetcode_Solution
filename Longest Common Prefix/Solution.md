## LeetCode Solutions

### Longest Common Prefix

- **Problem:** Longest Common Prefix  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/longest-common-prefix/solutions/7699308/longest-common-prefix-java-on-x-m-by-muk-zo5u)

#### Code
```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        String result = "";

        while (i < strs[0].length()) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return result;
                }
            }

            result += ch;
            i++;
        }

        return result;
    }
}
