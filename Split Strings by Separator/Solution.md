## LeetCode Solutions

### Split Strings by Separator

- **Problem:** Split Strings by Separator  
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/split-strings-by-separator/submissions/2068098830)

#### Code
```java
import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();

        String r = Pattern.quote(String.valueOf(separator));

        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            String[] s1 = s.split(r);

            for (String w : s1) {
                if (!w.isEmpty()) {
                    ans.add(w);
                }
            }
        }
        return ans;
    }
}
```
