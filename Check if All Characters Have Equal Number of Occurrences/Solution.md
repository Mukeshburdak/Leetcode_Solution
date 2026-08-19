## LeetCode Solutions

### Check if All Characters Have Equal Number of Occurrences

- **Problem:** Check if All Characters Have Equal Number of Occurrences
- **Platform:** LeetCode  
- **Language:** Java  
- **Solution Link:** [View on LeetCode](https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/submissions/2113042389)

#### Code
```java
class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> ans = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ans.containsKey(c)) {
                ans.put(c, ans.get(c) + 1);
            } else {
                ans.put(c, 1);
            }
        }
        int a = ans.get(s.charAt(0));
        for (Integer value : ans.values()) {
            if (value != a) {
                return false;
            }
        }
        return true;
    }
}
```
