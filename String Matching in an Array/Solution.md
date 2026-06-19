## LeetCode Solutions

### String Matching in an Array

- **Problem:** String Matching in an Array  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/string-matching-in-an-array/submissions/2038805306)

#### Code
```java
class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> res = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])) {
                    res.add(words[j]);
                } else if (words[j].contains(words[i])) {
                    res.add(words[i]);
                }
            }
        }
        ArrayList<String> list = new ArrayList<>(res);
        return list;
    }
}
```
